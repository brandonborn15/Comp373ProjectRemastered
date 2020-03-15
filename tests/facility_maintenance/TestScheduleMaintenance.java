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
        if(sm.getMaintCost() == 20.0){
            System.out.println("Passed");
        }
        else{System.out.println(sm.getMaintCost());
            System.out.println("Failed:\t Testing Maintenance Cost");}
    }
    public void testMaintTime(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.setDownTime(5);
        if(sm.getDownTime() == 5){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Maintenance Time");}
    }
    public void testHourMath(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.calcDownTimeForFacility(2);
        if(sm.getDownTime() == 4){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Maintenance Time Math");}

    }
    public void testCostMath(){
        ScheduleMaintenanceImpl sm = new ScheduleMaintenanceImpl();
        sm.calcMaintenanceCostForFacility(20.0);
        if(sm.getMaintCost() == 40.0){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Maintenance Cost Math");}
    }
   
    
    //Test getter and setter for maintDate
    //Test scheduleMaintenance
    //Test calcDownTimeForFacility
    //Test calcMaintenanceCostForFacility
    
}