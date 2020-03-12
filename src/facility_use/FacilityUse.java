package src.facility_use;

import java.util.List;

public interface FacilityUse {
    
    public List<GeneralUse> getReservations();
    public void setReservations(List<GeneralUse> reservations);
    public void addReservation(GeneralUse reservation);
    public List<Inspections> getInspections();
    public void setInspections(List<Inspections> inspections);
    public void addInspection(Inspections inspection);
    public boolean isInUseDuringInterval(String targetDate);
    public void vacateFacility(String vacateDate);

}