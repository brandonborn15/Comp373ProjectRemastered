package src.facility_use;

public interface GeneralUse {
    
    public String getResDate();
    public void setResDate(String resDate);
    public void assignFacilityToUse(int atendees);
    public void listActualUsage();
    public Double calcUsageRate();

}