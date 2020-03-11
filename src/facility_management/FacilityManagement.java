package src.facility_management;

import java.util.List;

import src.facility.Facility;

public interface FacilityManagement {
    
    public List<Facility> getFacilities();
    public void setFacilities(List<Facility> facilities);

    public String listFacilities();
    public void addNewFacility(Facility facility);

    public void removeFacility(Facility facility);
    public void getFacilityInformation(Facility facility);

}