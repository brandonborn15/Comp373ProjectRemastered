package src.client;

import java.util.LinkedList;

import src.facility.*;
import src.facility_maintenance.*;
import src.facility_management.*;
import src.facility_use.*;

public class FacilityManagementClient{

    public static void main(String[] args) {
        
        //-----------------------------------------------------BIG OBJECT-----------------------------------------------------------------
        FacilityManagementImpl manage = new FacilityManagementImpl();
        LinkedList<FacilityImpl> facilities = new LinkedList<FacilityImpl>();

        //Set Up General Use Object
        GeneralUseImpl genUse1 = new GeneralUseImpl();
        genUse1.setResDate("04/11/2020");
        GeneralUseImpl genUse2 = new GeneralUseImpl();
        genUse2.setResDate("03/10/2020");

        //Set Up Inspection Object
        InspectionImpl inspection1 = new InspectionImpl();
        inspection1.setInspectionDate("04/10/2020");
        InspectionImpl inspection2 = new InspectionImpl();
        inspection2.setInspectionDate("04/3/2020");

        //Set Up Facility Use Object
        FacilityUseImpl facUse1 = new FacilityUseImpl();
        facUse1.scheduleInspection(inspection1);
        facUse1.addReservation(genUse1);

        //Set Up Request Object
        RequestImpl request = new RequestImpl();
        request.setMaintRequest("The toilets are clogged");
        request.setMaintRequest("The toilet paper repair");

        //Set Up Schedule Maintenance Object
        ScheduleMaintenanceImpl schedMaint1 = new ScheduleMaintenanceImpl();
        schedMaint1.setMaintDate("04/09/2020");
        schedMaint1.calcMaintenanceCostForFacility(100.0);
        schedMaint1.calcDownTimeForFacility(5);

        //Set Up Facility Maintenance Object
        FacilityMaintenanceImpl facMaint1 = new FacilityMaintenanceImpl();
        facMaint1.makeFacilityMaintRequest(request);
        facMaint1.scheduleMaintenance(schedMaint1);

        //Set Up Facility Object
        FacilityImpl facility1 = new FacilityImpl();
        facility1.setFacilityCapacity(3000);
        facility1.setFacilityName("damen den");
        facility1.addFacilityDetail("This facility is a small room in Damen Student Center");
        facility1.setFacilityMaint(facMaint1);
        facility1.setFacilityUse(facUse1);
        
        //------------------------------------------------------Little Objects---------------------------------------------------------------------------
        FacilityImpl facility2 = new FacilityImpl();
        facility2.setFacilityCapacity(7000);
        facility2.setFacilityName("gentile arena");

        FacilityImpl facility3 = new FacilityImpl();
        facility3.setFacilityCapacity(10000);
        facility3.setFacilityName("sullivan center");
        //---------------------------------------------------------------------------------------------------------------------------------
        manage.addNewFacility(facility1);//add the new facilities created to the Facility Management
        //manage.addNewFacility(facility2);
        //manage.addNewFacility(facility3);

        /*facilities = manage.getFacilities();//retrieves the list of all facilities
        System.out.println(facilities.size());
        System.out.println(facilities);//will print the hashcode locations for these facilities

        manage.removeFacility(facility2);//removes completly the object known as facility 2 from the management
        facilities = manage.getFacilities();
        System.out.println(facilities.size());//prints the amount of facilities threr are under management

        System.out.println(facility1.getFacilityName());//facility1 exists only in the client but not declared or modified anywhere in management
        System.out.println(manage.listFacilities());//prints the names of all fcilities

        System.out.println(facMaint1.listMaintenance());
        //System.out.println(facUse1.list());
        System.out.println(manage.getFacilityInformation(facility1));*/
        facilities = manage.getFacilities();
        for (Facility facility : facilities){
            FacilityUseImpl fU = facility.getFacilityUse();
            boolean x = fU.isInUseDuringInterval("04/11/2020");
            if (x == true){
                System.out.println("YUP");
            }
        }
    }


}