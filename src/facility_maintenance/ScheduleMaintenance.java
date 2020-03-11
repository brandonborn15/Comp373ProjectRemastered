package src.facility_maintenance;

public interface ScheduleMaintenance {
    
    public String getMaintDate();
    public void setMaintDate(String maintDate);
    public void scheduleMaintenance();
    public Double calcDownTimeForFacility();
    public Double calcMaintenanceCostForFacility();

}