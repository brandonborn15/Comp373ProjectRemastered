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
        System.out.println("This is a test");
        TestGeneralUse tgu = new TestGeneralUse();
        tgu.testGenUse();
        FacilityImpl fac = new FacilityImpl();
        fac.setFacilityCapacity(3000);
        fac.setFacilityName("damen");
    }
}
