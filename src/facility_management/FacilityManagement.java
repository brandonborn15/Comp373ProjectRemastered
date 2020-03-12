package src.facility_management;

import java.util.LinkedList;

import src.facility.*;

public interface FacilityManagement {
    
    public LinkedList<FacilityImpl> getFacilities();
    public void setFacilities(LinkedList<FacilityImpl> facilities);
    
    public void addNewFacility(FacilityImpl facility);
    public void removeFacility(FacilityImpl facility);
    public LinkedList<String> listFacilities();
    public LinkedList<String> getFacilityInformation(FacilityImpl facility);

}