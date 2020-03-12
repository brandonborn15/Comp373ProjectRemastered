package src.facility_use;

import java.util.List;

public interface FacilityUse {
    
    public List<GeneralUse> getReservations();
    public void setReservations(List<GeneralUse> reservations);
    public void addReservation(GeneralUse reservation);

    public List<Inspection> getInspections();
    public void setInspections(List<Inspection> inspections);
    public void scheduleInspection(Inspection inspection);
    
    public boolean isInUseDuringInterval(String targetDate);
    public void vacateFacility(String vacateDate);

    public void listInspections(); //Not finished moved to facility use
    public Double calcUsageRate();
    public void listActualUsage();
    public void assignFacilityToUse(int atendees);

}