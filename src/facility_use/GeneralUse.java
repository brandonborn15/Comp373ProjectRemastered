package src.facility_use;

public interface GeneralUse {
    
    public String getReservation();
    public void setReservation(String reservation);
    public void assignFacilityToUse(int atendees);
    public void listActualUsage();
    public Double calcUsageRate();

}