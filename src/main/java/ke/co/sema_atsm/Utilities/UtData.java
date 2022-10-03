package ke.co.sema_atsm.Utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.scene.image.Image;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import ke.co.sema_atsm.BusinessLogic.RequestModels.Questions;
import ke.co.sema_atsm.BusinessLogic.RequestModels.User;
import ke.co.sema_atsm.UI.Models.LanguagePack;

import java.util.List;

public class UtData {
    public static String api_url;
    public static String token;
    public static String selectedDisease;
    public static Image mainIcon = new Image("/imgs/diagnostic_icon.png");
    public static Image tuberculosisPrintOut = new Image("/imgs/newReceiptTB.jpg");
    public static Image nationalLeprocyPrintOut = new Image("/imgs/natLepImg.png");
    public static Image semaImgPrintOut = new Image("/imgs/main_icon3.png");
    public static Image craneImgPrintOut = new Image("/imgs/main_icon1.png");
    public static Image amrefImgPrintOut = new Image("/imgs/main_icon4.png");
    public static Stage originalOwner;
    public static String diagnosisUrl;
    public static User currentUser;
    public static String questionAndAnswerString;
    public static ObjectMapper objectMapper;
    public static List<Questions> questionForUser;
    public static boolean isPrintJobSuccessfull;
    public static LanguagePack selectedLanguagePack;
    public static String selectedLanguage;
    public static final String shutdownPassword = "sema";
    public static String ageState;
}
