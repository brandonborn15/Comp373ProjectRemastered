package src.facility_use;

import java.util.LinkedList;

public class FacilityUseImpl implements FacilityUse{
    private LinkedList<InspectionImpl> inspections = new LinkedList<>();
    private LinkedList<GeneralUseImpl> reservations = new LinkedList<>();

    //Getters, Setters, and Add Methods-----------------------------------------------------------------------------------------------------
    public LinkedList<GeneralUseImpl> getReservations(){
        return reservations;
    }

    public void setReservations(LinkedList<GeneralUseImpl> reservations){
        this.reservations = reservations;
    }

    public LinkedList<InspectionImpl> getInspections(){
        return inspections;
    }

    public void setInspections(LinkedList<InspectionImpl> inspections){
        this.inspections = inspections;
    }

    //Required Methods for Assignment------------------------------------------------------------------------------------------------------
    public void addReservation(GeneralUseImpl reservation){ //FINISHED
        reservations.add(reservation);
    }
    
    public void scheduleInspection(InspectionImpl inspection){ //FINISHED
        inspections.add(inspection);
    }

    public boolean isInUseDuringInterval(String targetDate){ //FINISHED
        boolean isInUse = false;
        LinkedList<String> usedDates = new LinkedList<String>();
        for (GeneralUseImpl gU : reservations){
            usedDates.add(gU.getResDate());
        }
        for (Inspection i : inspections){
            usedDates.add(i.getInspectionDate());
        }
        for (String date : usedDates){
            if (date.equals(targetDate)){
                isInUse = true;
            }
        }
        return isInUse;
    }

    public LinkedList<String> vacateFacility(String vacateDate){ //FINISHED
        LinkedList<String> vacatedDates = new LinkedList<String>();
        for (GeneralUseImpl gU : reservations){
            String gUD = gU.getResDate();
            if (gUD.equals(vacateDate)){
                vacatedDates.add(gUD);
                reservations.remove(gU);
            }
        }
        for (Inspection i : inspections){
            String iD = i.getInspectionDate();
            if (iD.equals(vacateDate)){
                vacatedDates.add(iD);
                inspections.remove(i);
            }
        }
        return vacatedDates;
    }

    public LinkedList<String> listActualUsage(){ //FINISHED
        LinkedList<String> actualUsage = new LinkedList<String>();
        for (GeneralUse reservation : reservations){
            actualUsage.add(reservation.getResDate());
        }
        return actualUsage;
    }

    public Double calcUsageRate(){ //FINISHED
        int size = reservations.size();
        Double usageRate = size / 90.0;
        return usageRate;
    }

    public LinkedList<String> listInspections(){ //FINISHED
        LinkedList<String> inspectionsList = new LinkedList<String>();
        for (Inspection inspection : inspections){
            inspectionsList.add(inspection.getInspectionDate());
        }
        return inspectionsList;
    }
}