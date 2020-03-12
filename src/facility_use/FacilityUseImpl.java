package src.facility_use;

import java.util.LinkedList;

public class FacilityUseImpl implements FacilityUse{
    private LinkedList<InspectionImpl> ins = new LinkedList<>();
    private LinkedList<GeneralUseImpl> res = new LinkedList<>();

    //Getters, Setters, and Add Methods-----------------------------------------------------------------------------------------------------
    public LinkedList<GeneralUseImpl> getReservations(){
        return res;
    }

    public void setReservations(LinkedList<GeneralUseImpl> res){
        this.res = res;
    }

    public LinkedList<InspectionImpl> getInspections(){
        return ins;
    }

    public void setInspections(LinkedList<InspectionImpl> ins){
        this.ins = ins;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addReservation(GeneralUseImpl reservation){ //not Finished
        res.add(reservation);
    }
    
    public void scheduleInspection(InspectionImpl inspection){ //not Finished
        ins.add(inspection);
    }

    public boolean isInUseDuringInterval(String targetDate){ //Not finished take in target date, check if it already exists, return boolean true or false
        boolean isInUse = false;
        return isInUse;
    }

    public void vacateFacility(String vacateDate){ //Not finished returns the date that reoccurs for the corrsiponding facility

    }
    public void listActualUsage(){ //Not finished move to facility use

    }
    public Double calcUsageRate(){ //Not finished moved to facility use, size of reservations/90 return number 
        Double usageRate = 0.00;
        return usageRate;
    }
    public void assignFacilityToUse(int atendees){ //Not finished

    }
    public void listInspections(){ //Not finished moved to facility use

    }
}