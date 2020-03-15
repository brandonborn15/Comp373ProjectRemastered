package tests.maintest;

import java.util.LinkedList;

import src.facility.*;
import src.facility_maintenance.*;
import src.facility_management.*;
import src.facility_use.*;

import tests.facility.*;
import tests.facility_maintenance.*;
import tests.facility_management.*;
import tests.facility_use.*;

public class AllTests{

   public static void main(String[] args){
            System.out.println();
        TestGeneralUse tgu = new TestGeneralUse();
        System.out.println("Testing General Use");
        tgu.testGenUse();
            System.out.println();

        TestInspection ti = new TestInspection();
        System.out.println("Testing Inspections");
        ti.testInspec();
            System.out.println();

        TestFacility tf = new TestFacility();
        System.out.println("Testing Facility");
        tf.testName();
        tf.testCapacity();
        //tf.testFacilityUse();
        tf.TestFacilityDetial();
        tf.testRequestCapacity();
            System.out.println();

        TestScheduleMaintenance tsm = new TestScheduleMaintenance();
        System.out.println("Testing Schedule Maintenance");
        tsm.testMaintCost();
        tsm.testMaintDate();
        tsm.testMaintTime();
        tsm.testCostMath();
        tsm.testHourMath();
            System.out.println();

        TestRequest tr = new TestRequest();
        System.out.println("Testing Requests");
        tr.testRequest();
            System.out.println();

    }
}
