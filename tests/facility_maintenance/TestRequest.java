package tests.facility_maintenance;

import src.facility_maintenance.Request;
import src.facility_maintenance.RequestImpl;

public class TestRequest{
    public void testRequest(){
        RequestImpl r = new RequestImpl();
        r.setMaintRequest("2/13/2020");
        if(r.getMaintRequest().equals("2/13/2020")){
            System.out.println("Passed");
        }
        else{System.out.println("Failed:\t Testing Requests");}
    }
    //Test getter and setter for maintRequest
    //Test makeFacilityMaintRequest
    
}