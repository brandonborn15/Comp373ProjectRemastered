package src.facility_use;

public class GeneralUseImpl implements GeneralUse {
    private String resDate;

    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public String getResDate(){
        return resDate;// returns the string of the reservation date
    }
    public void setResDate(String resDate){
        this.resDate = resDate;//sets the string of a reservation date from user input
    }
}