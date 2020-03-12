package src.facility;

import java.util.LinkedList;

import src.facility_use.*;
import src.facility_maintenance.*;
public interface Facility {
    
    public String getFacilityName();
    public void setFacilityName(String facilityName);

    public int getFacilityCapacity();
    public void setFacilityCapacity(int facilityCapacity);

    public LinkedList<FacilityUseImpl> getFacilityUses();
    public void setFacilityUses(LinkedList<FacilityUseImpl> facilityUses);
    public void addFacilityUse(FacilityUseImpl facilityUse);
    
    public LinkedList<FacilityMaintenanceImpl> getFacilityMaints();
    public void setFacilityMaints(LinkedList<FacilityMaintenanceImpl> facilityMaints);
    public void addFacilityMaint(FacilityMaintenanceImpl facilityMaint);
    
    public int requestAvailableCapacity(int numAtendees);
    public void addFacilityDetail(String description);

}