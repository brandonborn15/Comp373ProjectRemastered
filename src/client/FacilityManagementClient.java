package src.client;

import java.util.LinkedList;
import java.util.List;

import src.facility.*;
import src.facility_maintenance.*;
import src.facility_management.*;
import src.facility_use.*;

public class FacilityManagementClient{

    public static void main(String[] args) {
        List<Facility> facilities = new LinkedList<Facility>();
        //FacilityManagement FacilityManagement;
        FacilityManagementImpl manage = new FacilityManagementImpl();

        FacilityImpl facility1 = new FacilityImpl();
        facility1.setFacilityCapacity(3000);
        facility1.setFacilityName("damen den");
        facilities.add(facility1);

        FacilityImpl facility2 = new FacilityImpl();
        facility2.setFacilityCapacity(7000);
        facility2.setFacilityName("gentile arena");
        facilities.add(facility2);
        
        /*FacilityManagementImpl myFacility = new FacilityManagementImpl();
        myFacility.setFacilities(facilities);
        myFacility.getFacilities();
        System.out.println();
        System.out.println(myFacility.getFacilities());*/
        manage.setFacilities(facilities);
        System.out.println(manage.getFacilities().size()+"\n");
        manage.removeFacility(facility1);
        System.out.println(manage.getFacilities().size()+"\n");
        manage.addNewFacility("sullivan center", 5000);
        System.out.println(manage.getFacilities().size()+"\n");
        //System.out.println(facility1.getFacilityName()+": "+facility1.getFacilityCapacity()+"\n");
        //System.out.println(facility2.getFacilityName()+": "+facility2.getFacilityCapacity()+"\n");
        //FacilityUseImpl myFacilityUse = new FacilityUseImpl();
        FacilityMaintenanceImpl maint = new FacilityMaintenanceImpl();



    }


}