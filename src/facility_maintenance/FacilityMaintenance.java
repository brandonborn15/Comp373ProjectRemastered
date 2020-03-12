package src.facility_maintenance;

import java.util.LinkedList;

public interface FacilityMaintenance {
    
    public LinkedList<RequestImpl> getRequests();
    public void setRequests(LinkedList<RequestImpl> requests);

    public LinkedList<ScheduleMaintenanceImpl> getSchedMaints();
    public void setSchedMaints(LinkedList<ScheduleMaintenanceImpl> schedMaints);
    
    public void makeFacilityMaintRequest(RequestImpl request);
    public void scheduleMaintenance(ScheduleMaintenanceImpl schedMaint);

    public Double calcProblemRateForFacility();
    public void listMaintRequests();
    public void listMaintenance();

}