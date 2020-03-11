package src.facility_management;

import src.facility.Facility;
import src.facility.FacilityImpl;

import java.util.ArrayList;
import java.util.List;

public class FacilityManagementImpl implements FacilityManagement{
    public List<Facility> facilities;

    public List<Facility> getFacilities(){
        return facilities;
    }

    public void setFacilities(List<Facility> facilities){
        this.facilities = facilities;
    }

    
    public List<String> listFacilities(){
        List<String> facilityNames = new ArrayList<>();
        facilityNames.add("damen den");
        return facilityNames;

    }

    public void addNewFacility(Facility facility){
        this.facilities.add(facility);
    }

    public void removeFacility(Facility facility){
        this.facilities.remove(facility);
    }

    public void getFacilityInformation(Facility facility){

    }
}