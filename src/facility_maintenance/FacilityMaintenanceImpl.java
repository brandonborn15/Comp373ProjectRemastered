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
    public void makeFacilityMaintRequest(RequestImpl request){ //FINISHED
        requests.add(request);
    }
    
    public void scheduleMaintenance(ScheduleMaintenanceImpl schedMaint){ //FINISHED
        schedMaints.add(schedMaint);
    }

    public Double calcProblemRateForFacility(){ //FINISHED
        Double problemRate;
        int problems = requests.size();
        problemRate = problems / 90.0;
        return problemRate;
    }

    public LinkedList<String> listMaintRequests(){ //FINISHED
        LinkedList<String> reqs = new LinkedList<String>();
        for (Request request : requests){
            reqs.add(request.getMaintRequest());
        }
        return reqs;
    }

    public LinkedList<String> listMaintenance(){ //FINISHED
        LinkedList<String> sMs = new LinkedList<String>();
        for (ScheduleMaintenanceImpl sM : schedMaints){
            sMs.add(sM.getMaintDate());
        }
        return sMs;
    }
}