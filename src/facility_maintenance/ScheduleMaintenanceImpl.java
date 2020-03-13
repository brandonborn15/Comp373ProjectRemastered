package src.facility_maintenance;

public class ScheduleMaintenanceImpl implements ScheduleMaintenance {
    private String maintDate;
    private int downTime;
    private Double maintCost;

    //Getters and Setters------------------------------------------------------------------------------------------------------------------
    public String getMaintDate(){
        return maintDate;
    }

    public void setMaintDate(String maintDate){
        this.maintDate = maintDate;
    }

    public int getDownTime(){
        return downTime;
    }

    public void setDownTime(int downTime){
        this.downTime = downTime;
    }

    public Double getMaintCost(){
        return maintCost;
    }

    public void setMaintCost(Double maintCost){
        this.maintCost = maintCost;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public int calcDownTimeForFacility(int estimate){ //FINISHED
        int downTime = estimate * 2;
        setDownTime(downTime);
        return downTime;
    }

    public Double calcMaintenanceCostForFacility(Double estimate){ //FINISHED
        Double maintCost = estimate * 2.00;
        setMaintCost(maintCost);
        return maintCost;
    }
}