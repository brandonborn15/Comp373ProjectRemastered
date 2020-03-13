package src.facility_maintenance;

public interface ScheduleMaintenance {
    
    public String getMaintDate();
    public void setMaintDate(String maintDate);
    public int getDownTime();
    public void setDownTime(int downTime);
    public Double getMaintCost();
    public void setMaintCost(Double maintCost);
    
    public int calcDownTimeForFacility(int estimate);
    public Double calcMaintenanceCostForFacility(Double estimate);

}