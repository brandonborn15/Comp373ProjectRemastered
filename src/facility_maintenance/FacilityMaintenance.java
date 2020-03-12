package src.facility_maintenance;

import java.util.List;

public interface FacilityMaintenance {
    
    public List<Request> getRequests();
    public void setRequests(List<Request> requests);
    public List<ScheduleMaintenance> getSchedMaints();
    public void setSchedMaints(List<ScheduleMaintenance> schedMaints);
    
    public void makeFacilityMaintRequest(Request request);
    public void scheduleMaintenance(ScheduleMaintenance schedMaint);
    public Double calcProblemRateForFacility();
    public void listMaintRequests();
    public void listMaintenance();

}