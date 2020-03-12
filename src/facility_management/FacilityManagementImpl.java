package src.facility_management;

import src.facility.Facility;

import java.util.List;

public class FacilityManagementImpl implements FacilityManagement{
    public List<Facility> facilities;

    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public List<Facility> getFacilities(){
        return facilities;
    }

    public void setFacilities(List<Facility> facilities){
        this.facilities = facilities;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addNewFacility(Facility facility){ //not Finished
        this.facilities.add(facility);
    }

    public void removeFacility(Facility facility){ //not Finished
        this.facilities.remove(facility);
    }

    public void getFacilityInformation(Facility facility){ //Not finished print all variables of a facility

    }
}