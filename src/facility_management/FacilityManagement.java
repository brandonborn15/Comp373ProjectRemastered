package src.facility_management;

import java.util.LinkedList;

import src.facility.*;

public interface FacilityManagement {
    
    public LinkedList<FacilityImpl> getFacilities();
    public void setFacilities(LinkedList<FacilityImpl> facilities);
    
    public void addNewFacility(FacilityImpl facility);
    public void removeFacility(FacilityImpl facility);
    public void getFacilityInformation(FacilityImpl facility);

}