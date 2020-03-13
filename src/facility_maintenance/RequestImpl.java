package src.facility_maintenance;

public class RequestImpl implements Request {
    private String maintRequest;
    
    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public String getMaintRequest(){//retrieves the string of the date when called
        return maintRequest;
    }

    public void setMaintRequest(String maintRequest){
        this.maintRequest = maintRequest; //adds a string of a date to the string maint request
    }
}