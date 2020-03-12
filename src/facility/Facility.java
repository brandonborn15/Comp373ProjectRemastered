package src.facility;

import java.util.List;

import src.facility_use.FacilityUse;
import src.facility_maintenance.FacilityMaintenance;
public interface Facility {
    
    public String getFacilityName();
    public void setFacilityName(String facilityName);

    public int getFacilityCapacity();
    public void setFacilityCapacity(int facilityCapacity);

    public List<FacilityUse> getFacilityUses();
    public void setFacilityUses(List<FacilityUse> facilityUses);
    public void addFacilityUse(FacilityUse facilityUse);
    
    public List<FacilityMaintenance> getFacilityMaints();
    public void setFacilityMaints(List<FacilityMaintenance> facilityMaints);
    public void addFacilityMaint(FacilityMaintenance facilityMaint);
    
    public int requestAvailableCapacity(int numAtendees);
    public void addFacilityDetail();

}