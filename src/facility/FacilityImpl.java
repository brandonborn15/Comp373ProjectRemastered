package src.facility;

import src.facility_use.*;
import src.facility_maintenance.*;

public class FacilityImpl implements Facility {
    private String facilityName;
    private int facilityCapacity;
    private String description;
    private FacilityUseImpl facilityUse;
    private FacilityMaintenanceImpl facilityMaint;

    //Getters, Setters, and Add Methods-----------------------------------------------------------------------------------------------------
    public String getFacilityName(){
        return facilityName;//return the facilities name as a string
    }

    public void setFacilityName(String facilityName){
        this.facilityName = facilityName;//set the facility name for the object
    }

    public int getFacilityCapacity(){
        return facilityCapacity;//return the facilities discription as an integer
    }

    public void setFacilityCapacity(int facilityCapacity){
        this.facilityCapacity = facilityCapacity; //set the facility capacity for the object
    }

    public String getDescription(){
        return description;//return the facilities discription as a string
    }
    
    public FacilityUseImpl getFacilityUse(){
        return facilityUse;//return the facility use
    }

    public void setFacilityUse(FacilityUseImpl facilityUse){
        this.facilityUse = facilityUse; //set the faility use for the object
    }

    public FacilityMaintenanceImpl getFacilityMaint(){
        return facilityMaint;//return the facility maintenance
    }

    public void setFacilityMaint(FacilityMaintenanceImpl facilityMaint){
        this.facilityMaint = facilityMaint; //set the faciliy maintenance for the object
    }

    //Required Methods for Assignment-----------------------------------------------------------------------------------------------------
    public int requestAvailableCapacity(int numAtendees){ //FINISHED
        int availableCapacity = facilityCapacity - numAtendees;//returns the capacity remaining after the input of people attending is user input
        return availableCapacity;
    }

    public void addFacilityDetail(String description){ //FINISHED
        this.description = description;//the user inputs a discription of the facility 
    }
}