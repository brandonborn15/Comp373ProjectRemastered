package src.facility_use;

public class InspectionImpl implements Inspection {
    private String inspectionDate;

    //Getters and Setters-----------------------------------------------------------------------------------------------------------------
    public String getInspectionDate(){
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate){
        this.inspectionDate = inspectionDate;
    }
}