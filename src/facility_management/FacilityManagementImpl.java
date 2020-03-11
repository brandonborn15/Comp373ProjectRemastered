package src.facility_management;

import src.facility.Facility;
import src.facility.FacilityImpl;

import java.util.LinkedList;
import java.util.List;

public class FacilityManagementImpl implements FacilityManagement{
    public List<Facility> facilities;

    public List<Facility> getFacilities(){
        //System.out.println(facilities);
        return facilities;
    }

    public void setFacilities(List<Facility> facilities){
        this.facilities = facilities;
    }
    @Override
    public void listFacilities(){
        //this.facilities.get(0);
        //System.out.println(List.toString(facilities));
        //return this.facilities;
    }

    public void addNewFacility(String name, Integer capacity){
        //List<Facility> facility = new LinkedList<Facility>();
        FacilityImpl facility = new FacilityImpl();
        facility.setFacilityName(name);
        facility.setFacilityCapacity(capacity);

        this.facilities.add(facility);
    }

    public void removeFacility(Facility facility){
        this.facilities.remove(facility);
    }

    public void getFacilityInformation(Facility facility){

    }
}