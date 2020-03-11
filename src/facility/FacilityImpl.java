package src.facility;

import java.util.List;

import src.facility_use.FacilityUse;
import src.facility_maintenance.FacilityMaintenance;

public class FacilityImpl implements Facility {
    private String facilityName;
    private int facilityCapacity;
    private List<FacilityUse> facilityUses;
    private List<FacilityMaintenance> facilityMaints;

    public int requestAvailableCapacity(int numAtendees){
        int availableCapacity = facilityCapacity - numAtendees;
        return availableCapacity;
    }
    
    public void addFacilityDetail(){
        //TODO
    }

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

    public List<FacilityMaintenance> getFacilityMaints(){
        return facilityMaints;
    }

    public void setFacilityMaints(List<FacilityMaintenance> facilityMaints){
        this.facilityMaints = facilityMaints;
    }

    public void addFacilityUse(FacilityUse facilityUse){
        facilityUses.add(facilityUse);
    }

    public void addFacilityMaint(FacilityMaintenance facilityMaint){
        facilityMaints.add(facilityMaint);
    }
}