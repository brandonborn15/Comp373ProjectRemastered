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

    public void addReservation(GeneralUse reservation){
        reservations.add(reservation);
    }

    public List<Inspection> getInspections(){
        return inspections;
    }

    public void setInspections(List<Inspection> inspections){
        this.inspections = inspections;
    }

    public void addInspection(Inspection inspection){
        inspections.add(inspection);
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public boolean isInUseDuringInterval(String targetDate){ //Not finished
        boolean isInUse = false;
        return isInUse;
    }

    public void vacateFacility(String vacateDate){ //Not finished

    }
}