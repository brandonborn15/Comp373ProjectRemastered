package src.facility_management;

import src.facility.Facility;

public interface FacilityManagement {
    
    public void listFacilities();
    public void addNewFacility(Facility facility);
    public void removeFacility(Facility facility);
    public void getFacilityInformation(Facility facility);
    
}