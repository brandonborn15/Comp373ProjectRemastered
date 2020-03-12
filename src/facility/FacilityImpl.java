package src.facility;

import java.util.LinkedList;

import src.facility_use.*;
import src.facility_maintenance.*;

public class FacilityImpl implements Facility {
    private String facilityName;
    private int facilityCapacity;
    private LinkedList<FacilityUseImpl> facilityUses = new LinkedList<>();
    private LinkedList<FacilityMaintenanceImpl> facilityMaints = new LinkedList<>();

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

    public LinkedList<FacilityUseImpl> getFacilityUses(){
        return facilityUses;
    }

    public void setFacilityUses(LinkedList<FacilityUseImpl> facilityUses){
        this.facilityUses = facilityUses;
    }

    public void addFacilityUse(FacilityUseImpl facilityUse){
        facilityUses.add(facilityUse);
    }

    public LinkedList<FacilityMaintenanceImpl> getFacilityMaints(){
        return facilityMaints;
    }

    public void setFacilityMaints(LinkedList<FacilityMaintenanceImpl> facilityMaints){
        this.facilityMaints = facilityMaints;
    }

    public void addFacilityMaint(FacilityMaintenanceImpl facilityMaint){
        facilityMaints.add(facilityMaint);
    }

    //Required Methods for Assignment-----------------------------------------------------------------------------------------------------
    public void addFacilityDetail(){ //make new variable for discription of facility
        
    }

    public int requestAvailableCapacity(int numAtendees){ //request full capacity subtracing the number of attendies and return difference
        int availableCapacity = facilityCapacity - numAtendees;
        return availableCapacity;
    }
}