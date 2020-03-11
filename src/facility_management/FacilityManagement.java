package src.facility_management;

import java.util.List;

import src.facility.Facility;

public interface FacilityManagement {
    
    public List<Facility> getFacilities();
    public void setFacilities(List<Facility> facilities);
    public void listFacilities();
    public void addNewFacility(String name, Integer capacity);
    public void removeFacility(Facility facility);
    public void getFacilityInformation(Facility facility);

}