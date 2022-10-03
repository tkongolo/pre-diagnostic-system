module SEMA.ATSM {
    requires okhttp3;
    requires org.apache.logging.log4j;
    requires javafx.graphics;
    requires com.fasterxml.jackson.databind;
    requires javafx.controls;
    requires javafx.swing;
    requires cipherencryptdecryptor;
    requires javafx.fxml;
    requires java.desktop;
    requires PrinterAPI;

    opens ke.co.sema_atsm to javafx.fxml;
    exports ke.co.sema_atsm;
}