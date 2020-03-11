package src.facility;

import java.util.List;

import src.facility_use.FacilityUse;
import src.facility_maintenance.FacilityMaintenance;
public interface Facility {
    
    public int requestAvailableCapacity(int numAtendees);
    public void addFacilityDetail();
    public List<FacilityUse> getFacilityUses();
    public void setFacilityUses(List<FacilityUse> facilityUses);
    public List<FacilityMaintenance> getFacilityMaints();
    public void setFacilityMaints(List<FacilityMaintenance> facilityMaints);

}