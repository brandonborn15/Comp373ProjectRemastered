package src.facility_maintenance;

import java.util.List;

public interface FacilityMaintenance {
    
    public List<Requests> getRequests();
    public void setRequests(List<Requests> requests);
    public List<ScheduleMaintenance> getSchedMaints();
    public void setSchedMaints(List<ScheduleMaintenance> schedMaints);
    public Double calcProblemRateForFacility();
    public void listMaintRequests();
    public void listMaintenance();

}