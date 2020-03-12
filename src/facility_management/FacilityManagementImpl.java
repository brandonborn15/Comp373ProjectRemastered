package src.facility_management;

import src.facility.*;

import java.util.LinkedList;
import java.util.List;
//import java.util.Objects;

public class FacilityManagementImpl implements FacilityManagement{
    public List<FacilityImpl> facilities;
    public LinkedList<FacilityImpl> fac = new LinkedList<>();

    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public LinkedList<FacilityImpl> getFacilities(){
        return fac;
    }

    public void setFacilities(LinkedList<FacilityImpl> facilities){
        this.facilities = facilities;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addNewFacility(FacilityImpl facility){ //not Finished
        //System.out.println(facility);
        this.fac.add(facility);
    }

    public void removeFacility(FacilityImpl facility){ //not Finished
        this.fac.remove(facility);
    }

    public void getFacilityInformation(FacilityImpl facility){ //Not finished print all variables of a facility

    }
}