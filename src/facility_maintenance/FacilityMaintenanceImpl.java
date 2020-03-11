package src.facility_maintenance;

import java.util.List;

public class FacilityMaintenanceImpl implements FacilityMaintenance {
    private List<Requests> requests;
    private List<ScheduleMaintenance> schedMaints;

    public List<Requests> getRequests(){
        return requests;
    }

    public void setRequests(List<Requests> requests){
        this.requests = requests;
    }

    public List<ScheduleMaintenance> getSchedMaints(){
        return schedMaints;
    }

    public void setSchedMaints(List<ScheduleMaintenance> schedMaints){
        this.schedMaints = schedMaints;
    }

    public Double calcProblemRateForFacility(){
        Double problemRate = 0.00;
        return problemRate;
    }

    public void listMaintRequests(){

    }

    public void listMaintenance(){
        
    }
}