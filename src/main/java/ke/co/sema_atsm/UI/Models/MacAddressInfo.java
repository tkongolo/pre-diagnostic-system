package ke.co.sema_atsm.UI.Models;

public class MacAddressInfo {

    private String macAddress;
    private String ipAddress;

    //setters

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    //getters

    public String getIpAddress() {
        return ipAddress;
    }

    public String getMacAddress() {
        return macAddress;
    }
}
