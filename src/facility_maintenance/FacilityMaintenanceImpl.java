package src.facility_maintenance;

import java.util.LinkedList;

public class FacilityMaintenanceImpl implements FacilityMaintenance {
    private LinkedList<RequestImpl> requests = new LinkedList<RequestImpl>();
    private LinkedList<ScheduleMaintenanceImpl> schedMaints = new LinkedList<ScheduleMaintenanceImpl>();

    //Getters, Setters, and Add Methods----------------------------------------------------------------------------------------------------
    public LinkedList<RequestImpl> getRequests(){
        return requests;
    }

    public void setRequests(LinkedList<RequestImpl> requests){
        this.requests = requests;
    }

    public LinkedList<ScheduleMaintenanceImpl> getSchedMaints(){
        return schedMaints;
    }

    public void setSchedMaints(LinkedList<ScheduleMaintenanceImpl> schedMaints){ //not finished
        this.schedMaints = schedMaints;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void makeFacilityMaintRequest(RequestImpl request){ //Finished
        requests.add(request);
    }
    
    public void scheduleMaintenance(ScheduleMaintenanceImpl schedMaint){ //Finished
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