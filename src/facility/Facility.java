package src.facility;

import src.facility_use.*;
import src.facility_maintenance.*;
public interface Facility {
    
    public String getFacilityName();
    public void setFacilityName(String facilityName);

    public int getFacilityCapacity();
    public void setFacilityCapacity(int facilityCapacity);

    public FacilityUseImpl getFacilityUse();
    public void setFacilityUse(FacilityUseImpl facilityUses);
    
    public FacilityMaintenanceImpl getFacilityMaint();
    public void setFacilityMaint(FacilityMaintenanceImpl facilityMaint);
    
    public int requestAvailableCapacity(int numAtendees);

    public String getDescription();
    public void addFacilityDetail(String description);

}