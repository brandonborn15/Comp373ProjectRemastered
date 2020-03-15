package tests.facility_maintenance;

import src.facility_maintenance.ScheduleMaintenance;
import src.facility_maintenance.ScheduleMaintenanceImpl;

public class TestScheduleMaintenance{

    public void testMaintDate(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.setMaintDate("11/23/2020");
        if(sm.getMaintDate().equals("11/23/2020")){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Maintenance Date");}
    }
    public void testMaintCost(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.setMaintCost(20.00);
        if(sm.getMaintCost() == 40.0){
            System.out.println("Passed");
        }
        else{System.out.println(sm.getDownTime());
            System.out.println("Failed:\t Testing Maintenance Cost");}
    }
    public void testMaintTime(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.setDownTime(5);
        if(sm.getDownTime() == 10){
            System.out.println("Passed");
        }
        else{System.out.println(sm.getDownTime());
            System.out.println("Failed:\t Testing Maintenance Time");}
    }
    
    //Test getter and setter for maintDate
    //Test scheduleMaintenance
    //Test calcDownTimeForFacility
    //Test calcMaintenanceCostForFacility
    
}