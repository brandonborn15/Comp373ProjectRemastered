package src.facility_maintenance;

public class RequestImpl implements Request {
    private String maintRequest;
    
    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public String getMaintRequest(){
        return maintRequest;
    }

    public void setMaintRequest(String maintRequest){
        this.maintRequest = maintRequest;
    }
}