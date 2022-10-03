package ke.co.sema_atsm.UI.Models;

import ke.co.sema_atsm.BusinessLogic.RequestModels.User;
import ke.co.sema_atsm.BusinessLogic.RequestModels.hospital;

public class HospitalReceipt {
    private hospital hospDetails;
    private User userDetails;

    //setters


    public void setHospDetails(hospital hospDetails) {
        this.hospDetails = hospDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }

    //getters


    public hospital getHospDetails() {
        return hospDetails;
    }

    public User getUserDetails() {
        return userDetails;
    }
}
