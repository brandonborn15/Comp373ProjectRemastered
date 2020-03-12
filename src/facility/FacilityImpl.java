package src.facility;

import java.util.List;

import src.facility_use.FacilityUse;
import src.facility_maintenance.FacilityMaintenance;

public class FacilityImpl implements Facility {
    private String facilityName;
    private int facilityCapacity;
    private List<FacilityUse> facilityUses;
    private List<FacilityMaintenance> facilityMaints;

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

    public List<FacilityUse> getFacilityUses(){
        return facilityUses;
    }

    public void setFacilityUses(List<FacilityUse> facilityUses){
        this.facilityUses = facilityUses;
    }

    public void addFacilityUse(FacilityUse facilityUse){
        facilityUses.add(facilityUse);
    }

    public List<FacilityMaintenance> getFacilityMaints(){
        return facilityMaints;
    }

    public void setFacilityMaints(List<FacilityMaintenance> facilityMaints){
        this.facilityMaints = facilityMaints;
    }

    public void addFacilityMaint(FacilityMaintenance facilityMaint){
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