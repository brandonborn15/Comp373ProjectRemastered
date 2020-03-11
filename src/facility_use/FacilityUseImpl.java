package src.facility_use;

import java.util.List;

public class FacilityUseImpl implements FacilityUse{
    private List<GeneralUse> reservations;
    private List<Inspections> inspections;

    public List<GeneralUse> getReservations(){
        return reservations;
    }

    public void setReservations(List<GeneralUse> reservations){
        this.reservations = reservations;
    }

    public List<Inspections> getInspections(){
        return inspections;
    }

    public void setInspections(List<Inspections> inspections){
        this.inspections = inspections;
    }

    public boolean isInUseDuringInterval(String targetDate){
        boolean isInUse = false;
        return isInUse;
    }

    public void vacateFacility(String vacateDate){

    }
}