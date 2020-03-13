package src.facility_maintenance;

public class ScheduleMaintenanceImpl implements ScheduleMaintenance {
    private String maintDate;
    private int downTime;
    private Double maintCost;

    //Getters and Setters------------------------------------------------------------------------------------------------------------------
    public String getMaintDate(){
        return maintDate;//returns the maint date string
    }

    public void setMaintDate(String maintDate){
        this.maintDate = maintDate;//sets the string maintDate to what the client decided to input
    }

    public int getDownTime(){
        return downTime;//returns the downtime for the facility as an integer
    }

    public void setDownTime(int downTime){
        this.downTime = downTime;//sets the int downtime to what the math decides
    }

    public Double getMaintCost(){
        return maintCost;//returns the double of the maintenance cost
    }

    public void setMaintCost(Double maintCost){
        this.maintCost = maintCost;//sets the double of the maintCost to what the math decides
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public int calcDownTimeForFacility(int estimate){ //FINISHED
        int downTime = estimate * 2;//user inputs an estimate and will return a new int of a downtime depending on the math 
        setDownTime(downTime);
        return downTime;
    }

    public Double calcMaintenanceCostForFacility(Double estimate){ //FINISHED
        Double maintCost = estimate * 2.00;//user inputs an estimate and will return a new double of a downtime depending on the math
        setMaintCost(maintCost);
        return maintCost;
    }
}