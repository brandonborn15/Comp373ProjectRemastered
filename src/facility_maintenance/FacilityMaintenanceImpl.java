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

    public List<ScheduleMaintenance> getSchedMaints(){
        return schedMaints;
    }

    public void setSchedMaints(List<ScheduleMaintenance> schedMaints){ //not finished
        this.schedMaints = schedMaints;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void makeFacilityMaintRequest(Request request){ //not Finished
        requests.add(request);
    }
    
    public void scheduleMaintenance(ScheduleMaintenance schedMaint){ //Finished
        schedMaints.add(schedMaint);
    }

    public Double calcProblemRateForFacility(){ //Not finished get lenght of requests/90
        Double problemRate = 0.00;
        return problemRate;
    }

    public void listMaintRequests(){ //Not finished print lists of requests of a string 

    }

    public void listMaintenance(){ //Not finished finished print lists of dates of a string
        
    }
}