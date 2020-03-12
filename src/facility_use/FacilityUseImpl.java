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
    public void addReservation(GeneralUse reservation){ //Finished
        reservations.add(reservation);
    }
    
    public void scheduleInspection(Inspection inspection){ //Finished
        inspections.add(inspection);
    }

    public boolean isInUseDuringInterval(String targetDate){ //Not finished
        boolean isInUse = false;
        return isInUse;
    }

    public void vacateFacility(String vacateDate){ //Not finished

    }
}