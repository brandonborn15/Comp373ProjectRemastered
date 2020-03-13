package src.facility_management;

import src.facility.*;

import java.util.LinkedList;
import java.util.List;

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
    public void addNewFacility(FacilityImpl facility){ //FINISHED
        this.fac.add(facility);
    }

    public void removeFacility(FacilityImpl facility){ //FINISHED
        this.fac.remove(facility);
    }

    public LinkedList<String> listFacilities(){ //FINISHED
        LinkedList<String> facilityNames = new LinkedList<String>();
        for (FacilityImpl facility : fac){
            facilityNames.add(facility.getFacilityName());
        }
        return facilityNames;
    }

    public LinkedList<String> getFacilityInformation(FacilityImpl facility){ //FINISHED
        LinkedList<String> info = new LinkedList<String>();
        info.add(facility.getFacilityName());
        info.add(Integer.toString(facility.getFacilityCapacity()));
        info.add(facility.getDescription());
        return info;
    }

    public String assignFacilityToUse(int atendees){ //TODO: NOT FINISHED - This needs to take in a number of atendees and return the name of a facility that could fit that many people
        LinkedList<String> possibilities = new LinkedList<String>();
        String temp;
        for(FacilityImpl facility : fac){
            int option;
            option = facility.getFacilityCapacity();
            if (option>=atendees){
                possibilities.add(facility.getFacilityName());
            }
        }
        if (possibilities.size() == 0){
            temp = "There are no possible locations for your event.";
        }
        else{temp = "Possible facility locations: "+possibilities.toString();}
        return temp;
    }
}