package src.facility_use;

import java.util.List;

public interface FacilityUse {
    
    public List<GeneralUse> getReservations();
    public void setReservations(List<GeneralUse> reservations);

    public List<Inspections> getInspections();
    public void setInspections(List<Inspections> inspections);
    
    public boolean isInUseDuringInterval(String targetDate);
    public void vacateFacility(String vacateDate);

}