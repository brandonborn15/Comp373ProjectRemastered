package src.facility_use;

import java.util.List;

public class FacilityUseImpl implements FacilityUse{
    private List<GeneralUse> reservations;
    private List<Inspection> inspections;

    //Getters, Setters, and Add Methods-----------------------------------------------------------------------------------------------------
    public List<GeneralUse> getReservations(){
        return reservations;
    }

    public void setReservations(List<GeneralUse> reservations){
        this.reservations = reservations;
    }

    public List<Inspection> getInspections(){
        return inspections;
    }

    public void setInspections(List<Inspection> inspections){
        this.inspections = inspections;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addReservation(GeneralUse reservation){ //not Finished
        reservations.add(reservation);
    }
    
    public void scheduleInspection(Inspection inspection){ //not Finished
        inspections.add(inspection);
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