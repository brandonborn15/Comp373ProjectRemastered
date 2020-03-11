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

        FacilityImpl facility3 = new FacilityImpl();
        facility3.setFacilityCapacity(10000);
        facility3.setFacilityName("sullivan center");
        facilities.add(facility3);
        
        manage.setFacilities(facilities);
        System.out.println(manage.getFacilities().size()+"\n");
        manage.removeFacility(facility1);
        System.out.println(manage.getFacilities().size()+"\n");
        manage.addNewFacility(facility3);
        System.out.println(manage.getFacilities().size()+"\n");
        manage.listFacilities();
        System.out.println(manage.listFacilities());
        //FacilityUseImpl myFacilityUse = new FacilityUseImpl();
        FacilityMaintenanceImpl maint = new FacilityMaintenanceImpl();



    }


}