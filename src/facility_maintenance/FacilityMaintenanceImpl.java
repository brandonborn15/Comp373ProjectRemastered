package src.facility_maintenance;

import java.util.List;

public class FacilityMaintenanceImpl implements FacilityMaintenance {
    private List<Request> requests;
    private List<ScheduleMaintenance> schedMaints;

    //Getters, Setters, and Add Methods----------------------------------------------------------------------------------------------------
    public List<Request> getRequests(){
        return requests;
    }

    public void setRequests(List<Request> requests){
        this.requests = requests;
    }

    public void addRequest(Request request){
        requests.add(request);
    }

    public List<ScheduleMaintenance> getSchedMaints(){
        return schedMaints;
    }

    public void setSchedMaints(List<ScheduleMaintenance> schedMaints){
        this.schedMaints = schedMaints;
    }

    public void addSchedMaint(ScheduleMaintenance schedMaint){
        schedMaints.add(schedMaint);
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public Double calcProblemRateForFacility(){ //Not finished
        Double problemRate = 0.00;
        return problemRate;
    }

    public void listMaintRequests(){ //Not finished

    }

    public void listMaintenance(){ //Not finished
        
    }
}