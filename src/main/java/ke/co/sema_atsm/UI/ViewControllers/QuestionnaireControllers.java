package ke.co.sema_atsm.UI.ViewControllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import ke.co.sema_atsm.App;
import ke.co.sema_atsm.BusinessLogic.RAccess;
import ke.co.sema_atsm.BusinessLogic.RequestModels.PayLoadQuestion;
import ke.co.sema_atsm.BusinessLogic.RequestModels.Questions;
import ke.co.sema_atsm.BusinessLogic.RequestModels.ViewedQuestion;
import ke.co.sema_atsm.UI.Models.FxmlUrl;
import ke.co.sema_atsm.Utilities.UtData;
import ke.co.sema_atsm.Utilities.UtJobs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireControllers extends MasterController {

}
