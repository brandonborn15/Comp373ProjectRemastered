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
    public LinkedList<String> vacateFacility(String vacateDate);

    public LinkedList<String> listInspections(); 
    public Double calcUsageRate();
    public LinkedList<String> listActualUsage();

}