package src.facility_use;

import java.util.LinkedList;

public interface FacilityUse {
    
    public LinkedList<GeneralUseImpl> getReservations();
    public void setReservations(LinkedList<GeneralUseImpl> reservations);
    public void addReservation(GeneralUseImpl reservation);

    public LinkedList<InspectionImpl> getInspections();
    public void setInspections(LinkedList<InspectionImpl> inspections);
    public void scheduleInspection(InspectionImpl inspection);
    
    public boolean isInUseDuringInterval(String targetDate);
    public void vacateFacility(String vacateDate);

    public void listInspections();
    public Double calcUsageRate();
    public void listActualUsage();
    public void assignFacilityToUse(int atendees);

}