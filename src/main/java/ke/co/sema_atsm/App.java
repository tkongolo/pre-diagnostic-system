package ke.co.sema_atsm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ke.co.sema_atsm.UI.ViewControllers.SplashScreenController;
import ke.co.sema_atsm.Utilities.UtData;
import ke.co.sema_atsm.Utilities.UtJobs;
import ke.co.sema_atsm.Utilities.UtSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App extends Application {

    public static final Logger logger = LogManager.getLogger(App.class);
    public static UtSettings settings;
    public static UtData utilitydata;

    public static Stage splashScreenStage;
    public static Scene primaryScene;
    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        App.splashScreenStage = primaryStage;

        SplashScreenController splashScreen = (SplashScreenController) UtJobs.displaySplashScreen(App.splashScreenStage);
        splashScreen.runTask();
        logger.info("Application started");
    }

    public static void main(String[] args){
        launch(args);
    }
}
