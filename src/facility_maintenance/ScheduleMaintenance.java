package src.facility_maintenance;

public interface ScheduleMaintenance {
    
    public String getMaintDate();
    public void setMaintDate(String maintDate);
    
    public int calcDownTimeForFacility();
    public Double calcMaintenanceCostForFacility();

}