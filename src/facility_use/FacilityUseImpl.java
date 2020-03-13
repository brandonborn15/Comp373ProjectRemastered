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
        reservations.add(reservation);//adds a reservation to the reservations list
    }
    
    public void scheduleInspection(InspectionImpl inspection){ //FINISHED
        inspections.add(inspection);//adds a inspection to the inspections list
    }

    public boolean isInUseDuringInterval(String targetDate){ //FINISHED
        boolean isInUse = false;
        LinkedList<String> usedDates = new LinkedList<String>();
        for (GeneralUseImpl gU : reservations){//reads all reservations and adds them to a temporary list to check
            usedDates.add(gU.getResDate());
        }
        for (Inspection i : inspections){//reads all inspections and adds them to a temporary list to check
            usedDates.add(i.getInspectionDate());
        }
        for (String date : usedDates){//reads all inspections/reservations and checks if the specific date is being in use 
            if (date.equals(targetDate)){
                isInUse = true;
            }
        }
        return isInUse;
    }

    public LinkedList<String> vacateFacility(String vacateDate){ //FINISHED //all for 1 specific facility object
        LinkedList<String> vacatedDates = new LinkedList<String>();
        for (GeneralUseImpl gU : reservations){//checks the reservations list if the vacate date matches it removes that string from the list
            String gUD = gU.getResDate();
            if (gUD.equals(vacateDate)){
                vacatedDates.add(gUD);
                reservations.remove(gU);
            }
        }
        for (Inspection i : inspections){//checks the inspections list if the vacate date matches it removes that string from the list
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
        for (GeneralUse reservation : reservations){//reads the dates in the reservations list and returns the dates for that facility
            actualUsage.add(reservation.getResDate());
        }
        return actualUsage;
    }

    public Double calcUsageRate(){ //FINISHED
        int size = reservations.size();//calculates the rate of usage by taking the list of reservations size divided by 3 months 
        Double usageRate = size / 90.0;
        return usageRate;
    }

    public LinkedList<String> listInspections(){ //FINISHED
        LinkedList<String> inspectionsList = new LinkedList<String>();
        for (Inspection inspection : inspections){//reads the dates in the inspections list and returns the dates for that facility
            inspectionsList.add(inspection.getInspectionDate());
        }
        return inspectionsList;
    }
}