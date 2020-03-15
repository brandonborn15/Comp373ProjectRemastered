package tests.facility_use;

import src.facility_use.InspectionImpl;

public class TestInspection{
    
    public void testInspec(){
        InspectionImpl inspec = new InspectionImpl();
        inspec.setInspectionDate("03/30/2020");
        String test = inspec.getInspectionDate();
        if (test.equals("03/30/2020")){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}