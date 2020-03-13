package src.facility_use;

import java.util.LinkedList;

public class FacilityUseImpl implements FacilityUse{
    private LinkedList<InspectionImpl> ins = new LinkedList<>();
    private LinkedList<GeneralUseImpl> res = new LinkedList<>();

    //Getters, Setters, and Add Methods-----------------------------------------------------------------------------------------------------
    public LinkedList<GeneralUseImpl> getReservations(){
        return res;
    }

    public void setReservations(LinkedList<GeneralUseImpl> res){
        this.res = res;
    }

    public LinkedList<InspectionImpl> getInspections(){
        return ins;
    }

    public void setInspections(LinkedList<InspectionImpl> ins){
        this.ins = ins;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addReservation(GeneralUseImpl reservation){ //FINISHED
        res.add(reservation);
    }
    
    public void scheduleInspection(InspectionImpl inspection){ //FINISHED
        ins.add(inspection);
    }

    public boolean isInUseDuringInterval(String targetDate){ //FINISHED
        boolean isInUse = false;
        LinkedList<String> usedDates = new LinkedList<String>();
        for (GeneralUseImpl gU : res){
            usedDates.add(gU.getResDate());
        }
        for (Inspection i : ins){
            usedDates.add(i.getInspectionDate());
        }
        for (String date : usedDates){
            if (date.equals(targetDate)){
                isInUse = true;
            }
        }
        return isInUse;
    }

    public void vacateFacility(String vacateDate){ //Not finished returns the date that reoccurs for the corrsiponding facility
        LinkedList<String> vacatedDates = new LinkedList<String>();
        LinkedList<GeneralUseImpl> toDelGU = new LinkedList<GeneralUseImpl>();
        for (GeneralUseImpl gU : res){
            String gUD = gU.getResDate();
            if (gUD.equals(vacateDate)){
                vacatedDates.add(gUD);
                res.remove(gU);
            }
        }
        for (Inspection i : ins){
            usedDates.add(i.getInspectionDate());
        }

    }

    public void listActualUsage(){ //Not finished

    }

    public Double calcUsageRate(){ //Not finished moved to facility use, size of reservations/90 return number 
        Double usageRate = 0.00;
        return usageRate;
    }

    public void assignFacilityToUse(int atendees){ //Not finished

    }

    public void listInspections(){ //Not finished moved to facility use

    }
}