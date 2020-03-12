package src.facility_maintenance;

public class ScheduleMaintenanceImpl implements ScheduleMaintenance {
    private String maintDate;

    //Getters and Setters------------------------------------------------------------------------------------------------------------------
    public String getMaintDate(){
        return maintDate;
    }

    public void setMaintDate(String maintDate){
        this.maintDate = maintDate;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public int calcDownTimeForFacility(){ //Not finished add variables to schedule maintnents object private int downtime
        int downTime = 0;
        return downTime;
    }

    public Double calcMaintenanceCostForFacility(){ //Not finished
        Double maintCost = 0.00;
        return maintCost;
    }
}