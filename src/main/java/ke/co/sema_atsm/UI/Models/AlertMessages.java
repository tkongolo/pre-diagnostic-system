package ke.co.sema_atsm.UI.Models;

import javafx.scene.control.Alert;

public class AlertMessages {
    public static final AlertInfo InternetError = new AlertInfo(InfoMessages.alertMessages_title_noMacAddress,
            InfoMessages.alertMessages_header_noMacAddress, InfoMessages.alertMessages_content_noMacAddress,
            Alert.AlertType.ERROR);

    public static final AlertInfo noSettingsFileError = new AlertInfo(InfoMessages.alertMessages_title_noSettingsFile,
            InfoMessages.alertMessages_header_noSettingsFile, InfoMessages.alertMessages_content_noSettingsFile,
            Alert.AlertType.ERROR);

    public static final AlertInfo authenticationFailedError = new AlertInfo(InfoMessages.alertMessages_title_authenticationError,
            InfoMessages.alertMessages_header_authenticationError, InfoMessages.alertMessages_content_noMacAddress,
            Alert.AlertType.ERROR);
}
