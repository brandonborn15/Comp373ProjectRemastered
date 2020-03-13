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
        return facilityName;
    }

    public void setFacilityName(String facilityName){
        this.facilityName = facilityName;
    }

    public int getFacilityCapacity(){
        return facilityCapacity;
    }

    public void setFacilityCapacity(int facilityCapacity){
        this.facilityCapacity = facilityCapacity;
    }

    public String getDescription(){
        return description;
    }
    
    public FacilityUseImpl getFacilityUse(){
        return facilityUse;
    }

    public void setFacilityUse(FacilityUseImpl facilityUse){
        this.facilityUse = facilityUse;
    }

    public FacilityMaintenanceImpl getFacilityMaint(){
        return facilityMaint;
    }

    public void setFacilityMaint(FacilityMaintenanceImpl facilityMaint){
        this.facilityMaint = facilityMaint;
    }

    //Required Methods for Assignment-----------------------------------------------------------------------------------------------------
    public int requestAvailableCapacity(int numAtendees){ //FINISHED
        int availableCapacity = facilityCapacity - numAtendees;
        return availableCapacity;
    }

    public void addFacilityDetail(String description){ //FINISHED
        this.description = description;
    }
}