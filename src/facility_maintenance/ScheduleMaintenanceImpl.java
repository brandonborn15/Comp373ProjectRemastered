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
    public void scheduleMaintenance(){ //Not finished

    }

    public int calcDownTimeForFacility(){ //Not finished
        int downTime = 0;
        return downTime;
    }

    public Double calcMaintenanceCostForFacility(){ //Not finished
        Double maintCost = 0.00;
        return maintCost;
    }
}