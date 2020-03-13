package src.facility_use;

public class InspectionImpl implements Inspection {
    private String inspectionDate;

    //Getters and Setters-----------------------------------------------------------------------------------------------------------------
    public String getInspectionDate(){
        return inspectionDate;// returns the string of the inspection date
    }

    public void setInspectionDate(String inspectionDate){
        this.inspectionDate = inspectionDate;//sets a userinput string as an inspection date
    }
}