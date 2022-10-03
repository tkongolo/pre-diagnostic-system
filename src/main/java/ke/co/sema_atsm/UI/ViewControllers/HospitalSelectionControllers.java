package ke.co.sema_atsm.UI.ViewControllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import ke.co.sema_atsm.App;
import ke.co.sema_atsm.BusinessLogic.RAccess;
import ke.co.sema_atsm.BusinessLogic.RequestModels.hospital;
import ke.co.sema_atsm.UI.Models.FxmlUrl;
import ke.co.sema_atsm.UI.Models.HospitalReceipt;
import ke.co.sema_atsm.UI.Models.ReceiptFormats;
import ke.co.sema_atsm.Utilities.UtData;
import ke.co.sema_atsm.Utilities.UtJobs;

import java.io.IOException;
import java.util.List;

public class HospitalSelectionControllers extends MasterController {

}
