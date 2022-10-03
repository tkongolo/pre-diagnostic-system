package ke.co.sema_atsm.Utilities;

public class UtSettings {
    private String ip_address;
    private String portNumber;
    private String printerName;

    //setters

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    //getters


    public String getIp_address() {
        return ip_address;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public String getPrinterName() {
        return printerName;
    }
}
