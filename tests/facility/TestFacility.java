package tests.facility;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import src.facility.Facility;
import src.facility.FacilityImpl;
import src.facility_use.FacilityUseImpl;
import src.facility_use.GeneralUseImpl;
//import src.facility.Facility.*;
import src.facility_use.InspectionImpl;

public class TestFacility {

    public void testName() {//Test getter and setter for facilityName 
        FacilityImpl fac = new FacilityImpl();
        fac.setFacilityName("Damen den");
        if (fac.getFacilityName().equals("Damen den")) {
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Facility Name");}
    }
    public void testCapacity(){ //Test getter and setter for facilityCapacity 
        FacilityImpl fac = new FacilityImpl();
        fac.setFacilityCapacity(3000);
        if (fac.getFacilityCapacity()==(3000)) {
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testign Facility Capacity");}
    }
    /*public void testFacilityUse(){//TODO: Test getter and setter for facilityUses
        FacilityImpl fac = new FacilityImpl();
        FacilityImpl fac2 = new FacilityImpl();

        InspectionImpl inspection = new InspectionImpl();
        inspection.setInspectionDate("04/10/2020");
        GeneralUseImpl genUse = new GeneralUseImpl();
        genUse.setResDate("04/11/2020");
        FacilityUseImpl facUse = new FacilityUseImpl();
        facUse.scheduleInspection(inspection);
        facUse.addReservation(genUse);

        InspectionImpl inspection2 = new InspectionImpl();
        inspection2.setInspectionDate("04/10/2020");
        GeneralUseImpl genUse2 = new GeneralUseImpl();
        genUse2.setResDate("04/11/2020");
        FacilityUseImpl facUse2 = new FacilityUseImpl();
        facUse2.scheduleInspection(inspection2);
        facUse2.addReservation(genUse2);

        fac.setFacilityUse(facUse);
        fac2.setFacilityUse(facUse2);
        //String t1 = fac.toString();
        //System.out.println(t1);
        if (fac.getFacilityUse().equals(fac2.getFacilityUse())){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Facility Use");}
    }*/
    public void TestFacilityDetial(){//Test addFacilityDetail
        FacilityImpl fac = new FacilityImpl();
        fac.addFacilityDetail("This is a test");
        if(fac.getDescription().equals("This is a test")){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Facility Detial");}
    }
    /*public void testFacilityMaints(){//Test getter and setter for facilityMaints
        RequestImpl request1 = new RequestImpl();
        request1.setMaintRequest("The toilets are clogged");

    }*/
    public void testRequestCapacity(){//Test requestAvailableCapacity
        FacilityImpl fac = new FacilityImpl();
        fac.setFacilityName("Damen");
        fac.setFacilityCapacity(1000);
        if(fac.requestAvailableCapacity(200) == 800){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Request Capacity");}
    }
}