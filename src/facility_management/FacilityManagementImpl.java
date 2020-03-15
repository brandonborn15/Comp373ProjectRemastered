package src.facility_management;

import src.facility.*;

import java.util.LinkedList;
import java.util.List;

public class FacilityManagementImpl implements FacilityManagement{
    public List<FacilityImpl> facilities;
    public LinkedList<FacilityImpl> fac = new LinkedList<>();

    //Getters and Setters-------------------------------------------------------------------------------------------------------------------
    public LinkedList<FacilityImpl> getFacilities(){ //returns a linkedlist of facilities that were stored
        return fac;
    }

    public void setFacilities(LinkedList<FacilityImpl> facilities){//takes the facility created and stores them in a linkedlist 
        this.facilities = facilities;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addNewFacility(FacilityImpl facility){ //FINISHED
        this.fac.add(facility);//adds a full objects of a facility to a list of facilities
    }

    public void removeFacility(FacilityImpl facility){ //FINISHED
        this.fac.remove(facility);//removes the full object of a given facility from the list of facilities
    }

    public LinkedList<String> listFacilities(){ //FINISHED
        LinkedList<String> facilityNames = new LinkedList<String>();
        for (FacilityImpl facility : fac){//looks at every facility in order and creates a list of only the facility names
            facilityNames.add(facility.getFacilityName());
        }
        return facilityNames;
    }

    public LinkedList<String> getFacilityInformation(FacilityImpl facility){ //FINISHED
        LinkedList<String> info = new LinkedList<String>();//grabs information from 3 methods and adds them to an instance of a linked list and returns it
        info.add(facility.getFacilityName()); //adds the facility name
        info.add(Integer.toString(facility.getFacilityCapacity())); //adds the facility capacity
        info.add(facility.getDescription()); //adds the facilities description
        return info;
    }

    public LinkedList<String> assignFacilityToUse(int atendees){ //FINISHED takes in a number of atendees and return the name of a facility that could fit that many people
        LinkedList<String> possibilities = new LinkedList<String>();//needs a temporary list to make possibilities
        for(FacilityImpl facility : fac){//checking each object in the list
            int option;
            option = facility.getFacilityCapacity();
            if (option>=atendees){//checks if the checked facility has a capacity less than or equal to the given number of atendees
                possibilities.add(facility.getFacilityName()); //if so adds the facility name to a list of possible locations to hold the event
            }
        }
        if (possibilities.size() == 0){//if the list of possible facilities is empty then there are no locations
            possibilities.add("NO Facilities"); // return that there is no possibilities
            return possibilities;
        }
        else{
            return possibilities;
           }//returns what facilities are avalible for the given space
    }
}