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
        GeneralUseImpl genUse3 = new GeneralUseImpl();
        genUse3.setResDate("03/27/2020");

        //Set Up Inspection Object
        InspectionImpl inspection1 = new InspectionImpl();
        inspection1.setInspectionDate("04/10/2020");
        InspectionImpl inspection2 = new InspectionImpl();
        inspection2.setInspectionDate("04/3/2020");
        InspectionImpl inspection3 = new InspectionImpl();
        inspection3.setInspectionDate("04/6/2020");

        //Set Up Facility Use Object
        FacilityUseImpl facUse1 = new FacilityUseImpl();
        facUse1.scheduleInspection(inspection1);
        facUse1.addReservation(genUse1);
        FacilityUseImpl facUse2 = new FacilityUseImpl();
        facUse2.scheduleInspection(inspection2);
        facUse2.addReservation(genUse2);
        FacilityUseImpl facUse3 = new FacilityUseImpl();
        facUse3.scheduleInspection(inspection3);
        facUse3.addReservation(genUse3);

        //Set Up Request Object
        RequestImpl request1 = new RequestImpl();
        request1.setMaintRequest("The toilets are clogged");
        RequestImpl request2 = new RequestImpl();
        request2.setMaintRequest("The toilet paper repair");
        RequestImpl request3 = new RequestImpl();
        request3.setMaintRequest("The speaker got wet");


        //Set Up Schedule Maintenance Object
        ScheduleMaintenanceImpl schedMaint1 = new ScheduleMaintenanceImpl();
        schedMaint1.setMaintDate("04/09/2020");
        schedMaint1.calcMaintenanceCostForFacility(100.0);
        schedMaint1.calcDownTimeForFacility(5);
        ScheduleMaintenanceImpl schedMaint2 = new ScheduleMaintenanceImpl();
        schedMaint2.setMaintDate("04/10/2020");
        schedMaint2.calcMaintenanceCostForFacility(100.0);
        schedMaint2.calcDownTimeForFacility(5);
        ScheduleMaintenanceImpl schedMaint3 = new ScheduleMaintenanceImpl();
        schedMaint3.setMaintDate("04/11/2020");
        schedMaint3.calcMaintenanceCostForFacility(100.0);
        schedMaint3.calcDownTimeForFacility(5);

        //Set Up Facility Maintenance Object
        FacilityMaintenanceImpl facMaint1 = new FacilityMaintenanceImpl();
        facMaint1.makeFacilityMaintRequest(request1);
        facMaint1.scheduleMaintenance(schedMaint1);
        FacilityMaintenanceImpl facMaint2 = new FacilityMaintenanceImpl();
        facMaint2.makeFacilityMaintRequest(request1);
        facMaint2.scheduleMaintenance(schedMaint1);
        FacilityMaintenanceImpl facMaint3 = new FacilityMaintenanceImpl();
        facMaint3.makeFacilityMaintRequest(request1);
        facMaint3.scheduleMaintenance(schedMaint1);

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
        facility2.addFacilityDetail("This facility is a college sized stadium connected to the Damen Student Center");
        facility2.setFacilityMaint(facMaint2);
        facility2.setFacilityUse(facUse2);

        FacilityImpl facility3 = new FacilityImpl();
        facility3.setFacilityCapacity(10000);
        facility3.setFacilityName("sullivan center");
        facility3.addFacilityDetail("This facility holds a small auditorium located on the bend of Sheridan and Devon");
        facility3.setFacilityMaint(facMaint3);
        facility3.setFacilityUse(facUse3);
        //---------------------------------------------------------------------------------------------------------------------------------
        manage.addNewFacility(facility1);//add the new facilities created to the Facility Management
        manage.addNewFacility(facility2);
        manage.addNewFacility(facility3);
        //---------------------------------------------------------------------------------------------------------------------------------

        System.out.println("\n\n\n\n\n\n\n******************************** Facility Management Client ********************************");


        facilities = manage.getFacilities();//retrieves the list of all facilities
        System.out.println("\n\n\nThe amount of facilities avalible at loyola is:\t\t"+facilities.size()+"\n");


        System.out.println("\t-----------------------------------Facility Names-----------------------------------\n");
        System.out.println("The name of the first facility is:\t\t\t"+facility1.getFacilityName()+"\n");//facility1 exists only in the client but not declared or modified anywhere in management
        System.out.println("The name of the second facility is:\t\t\t"+facility2.getFacilityName()+"\n");
        System.out.println("The name of the third facility is:\t\t\t"+facility3.getFacilityName()+"\n");


        System.out.println("The list of Loyola facilities is as follows:\t\t"+manage.listFacilities()+"\n");//prints the names of all fcilities


        System.out.println("\t--------------------------Facility Maintenance Informaiton--------------------------\n");
        System.out.println("The maintenance list for "+facility1.getFacilityName()+" is:\t\t\t"+facMaint1.listMaintenance()+"\n");
        System.out.println("The maintenance list for "+facility2.getFacilityName()+" is:\t\t"+facMaint2.listMaintenance()+"\n");
        System.out.println("The maintenance list for "+facility3.getFacilityName()+" is:\t\t"+facMaint3.listMaintenance()+"\n");


        System.out.println("\t--------------------------Facility Inspections Informaiton--------------------------\n");
        System.out.println("The Inspections list for "+facility1.getFacilityName()+" is:\t\t\t"+facUse1.listInspections()+"\n");
        System.out.println("The Inspections list for "+facility2.getFacilityName()+" is:\t\t"+facUse2.listInspections()+"\n");
        System.out.println("The Inspections list for "+facility3.getFacilityName()+" is:\t\t"+facUse3.listInspections()+"\n");

        
        System.out.println("\t--------------------------Facility Reservations Informaiton-------------------------\n");
        System.out.println("The Reservations list for "+facility1.getFacilityName()+" is:\t\t\t"+facUse1.listActualUsage()+"\n");
        System.out.println("The Reservations list for "+facility2.getFacilityName()+" is:\t\t"+facUse2.listActualUsage()+"\n");
        System.out.println("The Reservations list for "+facility3.getFacilityName()+" is:\t\t"+facUse3.listActualUsage()+"\n");
    

        System.out.println("\t----------------------------Facility General Informaiton----------------------------\n");
        System.out.println("The information provided is for number 1 on the list:\t"+manage.getFacilityInformation(facility1)+"\n");
        System.out.println("The information provided is for number 2 on the list:\t"+manage.getFacilityInformation(facility2)+"\n");
        System.out.println("The information provided is for number 3 on the list:\t"+manage.getFacilityInformation(facility3)+"\n");
        

        System.out.println("\t-----------------------------------Event Planning-----------------------------------\n");
        System.out.println("Checking possible facilities to use:\t\t\t"+manage.assignFacilityToUse(100000)+"\n");//if there isnt a location
        System.out.println("Checking possible facilities to use:\t\t\t"+manage.assignFacilityToUse(100)+"\n");//what if there is a location


        System.out.println("\t-------------------------------------Whats Next?------------------------------------\n");
        System.out.println(facility2.getFacilityName()+" was removed as a facility of Loyola University.\n");
        manage.removeFacility(facility2);//removes completly the object known as facility 2 from the management
        facilities = manage.getFacilities();
        System.out.println("The amount of facilities avalible at loyola is:\t\t"+facilities.size()+"\n");//prints the amount of facilities threr are under management
        System.out.println("The list of Loyola facilities is as follows:\t\t"+manage.listFacilities()+"\n");//prints the names of all fcilities
    }


}