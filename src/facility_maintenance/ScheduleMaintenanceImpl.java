package src.facility_maintenance;

public class ScheduleMaintenanceImpl implements ScheduleMaintenance {
    private String maintDate;

    public String getMaintDate(){
        return maintDate;
    }

    public void setMaintDate(String maintDate){
        this.maintDate = maintDate;
    }

    public void scheduleMaintenance(){

    }

    public int calcDownTimeForFacility(){
        int downTime = 0;
        return downTime;
    }

    public Double calcMaintenanceCostForFacility(){
        Double maintCost = 0.00;
        return maintCost;
    }
}