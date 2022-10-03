package ke.co.sema_atsm.Utilities;

import com.fasterxml.jackson.databind.JsonNode;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ke.co.cipher.CipherUtilsNew;
import ke.co.printerapi.Driver.DriverPrinter;
import ke.co.sema_atsm.App;
import ke.co.sema_atsm.BusinessLogic.RequestModels.PayLoadQuestion;
import ke.co.sema_atsm.BusinessLogic.RequestModels.Questions;
import ke.co.sema_atsm.BusinessLogic.RequestModels.ViewedQuestion;
import ke.co.sema_atsm.UI.Models.AlertInfo;
import ke.co.sema_atsm.UI.Models.AlertMessages;
import ke.co.sema_atsm.UI.Models.FxmlUrl;
import ke.co.sema_atsm.UI.Models.MacAddressInfo;

import java.awt.image.BufferedImage;
import java.awt.print.Printable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UtJobs {

    public static String getAPIUrl(String ipUrl, String ipPort){
        return "http://"+ ipUrl +":" + ipPort;
    }

    public static MacAddressInfo getMACAddress(){
        MacAddressInfo macAddressInfo = new MacAddressInfo();
        String macAddress = "";
        String ipAddress = "";

        String osValue = System.getProperty("os.name");

        //start with ip address
        InetAddress ip;

        try {
            ip = InetAddress.getLocalHost();
            App.logger.info("Current IP Address: " + ip.getHostAddress());
            if (osValue.equals("Linux")) {
                ipAddress = "192.168.1.31";
            } else {
                ipAddress = ip.getHostAddress();
            }
            App.logger.info("IpAddress: " + ipAddress);
            //ipAddress = ip.getHostAddress();
            macAddressInfo.setIpAddress(ipAddress);
            if(!ipAddress.equals("127.0.0.1")){

                if(osValue.equals("Linux")){
                    macAddress = "b4:69:21:7b:8c:25";
                }else{
                    NetworkInterface network = NetworkInterface.getByInetAddress(ip);
                    byte[] mac = network.getHardwareAddress();
                    StringBuilder sb = new StringBuilder();
                    for(int i = 0; i < mac.length; i++){
                        sb.append(String.format("%02X%s",mac[i], (i < mac.length - 1) ? ":" : ""));
                    }

                    App.logger.info("Current MAC address: " + sb.toString());
                    macAddress = sb.toString();
                }



            }

            macAddressInfo.setMacAddress(macAddress);


        } catch (Exception e) {
            App.logger.error("Error in getting mac address: " + e.getMessage());
            macAddressInfo.setMacAddress(macAddress);
            macAddressInfo.setIpAddress(ipAddress);
        }

        return macAddressInfo;


    }

    public static void generateAlert(AlertInfo alertInfo) {
        Alert alert = new Alert(alertInfo.getAlertType());
        alert.setTitle(alertInfo.getTitle());
        alert.setHeaderText(alertInfo.getHeader());
        alert.setContentText(alertInfo.getContent());

        alert.showAndWait();
    }

    public static void threadSleep(long value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException ex) {
            App.logger.error("Threading sleep error");
        }
    }

    public static FileInputStream getSettingsStream() {
        FileInputStream f;
        try {
            f = new FileInputStream("settings.properties");
            return f;
        } catch (FileNotFoundException e) {
            App.logger.error("Settings file not found");
            Platform.runLater(() -> {
                generateAlert(AlertMessages.noSettingsFileError);
            });

            return null;
        }
    }

    public static void setSettings(){
        App.settings = new UtSettings();

        FileInputStream s = getSettingsStream();
        if(s != null){
            Properties pros = new Properties();
            try {
                pros.load(s);

                //assign settings
                try{
                    App.settings.setIp_address(CipherUtilsNew.decrypt(pros.getProperty("ip_address")));
                    App.settings.setPortNumber(CipherUtilsNew.decrypt(pros.getProperty("portNumber")));
                    App.settings.setPrinterName(CipherUtilsNew.decrypt(pros.getProperty("printerName")));
                    App.logger.info("Printer Name: " + App.settings.getPrinterName());

                }catch(Exception ex){
                    App.logger.error("Settings error. Error in loading properties: " + ex.getMessage());
                    Platform.runLater(() -> {
                        generateAlert(AlertMessages.noSettingsFileError);
                    });

                    return;
                }

            } catch (IOException e) {
                App.logger.error("Settings error. Error in loading settings file: " + e.getMessage());
                return;
            }
        }else{
            System.exit(1);
        }
    }

    public static Object displaySplashScreen(Stage startupWindow) {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(FxmlUrl.WINDOW_SPLASHSCREEN));
            Parent root = (Parent) loader.load();
            Scene startupScene = new Scene(root);
            startupWindow.getIcons().add(UtData.mainIcon);
            startupWindow.setScene(startupScene);
            startupWindow.initStyle(StageStyle.UNDECORATED);
            startupWindow.show();
            return loader.getController();
        } catch (IOException ex) {
            App.logger.error("Unable to display splash screen: " + ex.getMessage());
        }
        return null;
    }

    public static void displayFXMLUrl(String url, StackPane selectedPane) {
        if (App.primaryStage == null) {
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            App.primaryStage = new Stage();
            App.primaryStage.getIcons().add(UtData.mainIcon);
            App.primaryStage.initStyle(StageStyle.UNDECORATED);
            App.primaryStage.setMaximized(true);
            UtData.originalOwner = App.primaryStage;

        }

        if (selectedPane == null) {
            try {
                FXMLLoader loader = new FXMLLoader(App.class.getResource(url));
                Parent root = (Parent) loader.load();
                if (App.primaryScene == null) {
                    App.primaryScene = new Scene(root);
                    App.primaryStage.setScene(App.primaryScene);
                } else {
                    App.primaryScene.setRoot(root);
                }

                App.primaryStage.show();

            } catch (IOException ex) {
                App.logger.error("Could not load url: " + url + ":" + ex.getMessage());
                ex.printStackTrace();
            }
        } else {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(App.class.getResource(url));
                StackPane namePane = (StackPane) loader.load();
                selectedPane.getChildren().setAll(namePane);
            } catch (IOException ex) {
                App.logger.error("Could not load url: " + url + ":" + ex.getMessage());
            }
        }
    }

    public static void openClosingPasswordWindow(){
        Stage newStage = new Stage();
        Stage originalOwner = UtData.originalOwner;
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource(FxmlUrl.WINDOW_PASSWORD));

        try {
            AnchorPane processDialogPane = (AnchorPane) loader.load();
            Scene scene = new Scene(processDialogPane);
            newStage.setScene(scene);
            newStage.setTitle("ShutDown Password");

            newStage.initOwner(originalOwner);
            newStage.initModality(Modality.WINDOW_MODAL);

            newStage.showAndWait();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            //System.out.println("Error Welcome Controller create process dialog : " + e.getMessage());
            App.logger.error("Could not load window:" + e.getMessage());

        }
    }



    public static JsonNode getInJsonFormat(String jsonValues){

        if(jsonValues != null){
            try {
                JsonNode jsonNode = UtData.objectMapper.readTree(jsonValues);
                return jsonNode;
            } catch (IOException e) {
                App.logger.error("Could not create json class: " + e.getMessage());
                return null;
            }
        }else{
            return null;
        }
    }

    public static String getValueofKeyFromJson(JsonNode node, String key){

        String res = "";

        App.logger.info("Node is " + node.toString());

        if(node != null){
            App.logger.info(node.get(key));
            res = node.get(key).asText();
            App.logger.info("Node info is: " + res);
            if(res.trim().isEmpty() ||res == null){
                res = null;
            }
        }
        return res;
    }

    public static String numberToWord(int number){
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety" };
        if(number == 0){
            return tensArray[0];
        }

        // add minus before conversion if the number is less than 0
        if (number < 0) { // convert the number to a string
            String numberStr = "" + number;
            // remove minus before the number
            numberStr = numberStr.substring(1);
            // add minus before the number and convert the rest of number
            return "minus " + numberToWord(Integer.parseInt(numberStr));
        }

        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
            words += numberToWord(number / 1000000) + " million ";
            number %= 1000000;
        }
        // check if number is divisible by 1 thousand
        if ((number / 1000) > 0) {
            words += numberToWord(number / 1000) + " thousand ";
            number %= 1000;
        }
        // check if number is divisible by 1 hundred
        if ((number / 100) > 0) {
            words += numberToWord(number / 100) + " hundred ";
            number %= 100;
        }

        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // fetch the appropriate value from unit array
                words += unitsArray[number];
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];
                if ((number % 10) > 0) {
                    words += "-" + unitsArray[number % 10];
                }
            }
        }

        return words;

    }

    public static String getQuestionAnswerRequestSend(){

        String res = "";
        int count = UtData.questionForUser.size();
        for(int i = 0; i < count; i++){
            Questions selected = UtData.questionForUser.get(i);
            String selectedString = requestFormatQuestionAndAnswer(selected);
            if(i == 0){
                res += selectedString;
            }else{
                res += "&" + selectedString;
            }
        }

        //add phone number and national id
        res += "&phoneNumber=" + UtData.currentUser.getPhoneNumber();
        res += "&name=" + UtData.currentUser.getIdNumber();
        //add gender and age group
        res += "&gender=" + UtData.currentUser.getGender();
        res += "&age=" + Integer.toString(UtData.currentUser.getAgeRange());

        return res;

    }

    public static String requestFormatQuestionAndAnswer(Questions ke){
        String valueWords = ke.getQuestionNumber();
        String answerWords = ke.getQuestionAnswer();
        return valueWords + "=" + answerWords;
    }

    public static String getNowDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public static boolean isEmptyorNull(String value) {

        boolean res = false;
        if (value == null || value.isEmpty()) {
            res = true;
        }
        return res;
    }

    public static Task<Void> printReceipt(Printable receiptPrintable){
        return new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                App.logger.debug("Printer name is " + App.settings.getPrinterName());
                DriverPrinter receiptPrinter = new DriverPrinter();
                receiptPrinter.printReceipt(receiptPrintable,
                        App.settings.getPrinterName());

                return null;
            }
        };
    }

    public static boolean isValidPhoneNumber(String phoneNumberText){
        boolean res = false;

        //confirm character value
        if(phoneNumberText.length() == 10){
            //confirm if it starts with zero seven
            if(phoneNumberText.substring(0,2).equals("07") || phoneNumberText.substring(0,2).equals("01")){
                res = true;
            }
        }

        return res;
    }

    public static BufferedImage getTuberculosisImage(){
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(UtData.tuberculosisPrintOut, null);
        return bufferedImage;
    }

    public static BufferedImage getBufImg(Image img){
        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(img, null);
        return bufferedImage;
    }

    public static boolean isNameFull(String nameValue){
        boolean res = false;
        if(nameValue != null){
            String[] namesplit = nameValue.split(" ");
            if(namesplit.length > 1){
                res = true;
            }
        }

        return res;
    }

    public static void shutDownComputer(){
        String shutdownCmd = "shutdown -s";
        try {
            Process child = Runtime.getRuntime().exec(shutdownCmd);
        } catch (IOException e) {
            App.logger.error("Could not shutdown: " + e.getMessage());
        }
    }

    public static String getResponseStatus(String resp){
        String statusValue = UtJobs.getValueofKeyFromJson(UtJobs.getInJsonFormat(resp), "status");
        return statusValue;
    }

    public static List<ViewedQuestion> getViewedQuestions(List<PayLoadQuestion> fullTotalQuestions){

        List<ViewedQuestion> res = new ArrayList<>();
        for (PayLoadQuestion plq : fullTotalQuestions){
            if(plq.getAge().equals(UtData.ageState) || plq.getAge().equals("all")){
                ViewedQuestion v = new ViewedQuestion();
                v.setPosition(plq.getPosition());
                v.setQuestion(plq.getQuestion());
                res.add(v);
            }
        }

        return res;
    }
}
