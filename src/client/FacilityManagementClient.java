package src.client;

import java.util.LinkedList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import src.facility.*;
import src.facility_maintenance.*;
import src.facility_management.*;
import src.facility_use.*;

public class FacilityManagementClient{

    public static void main(String[] args) throws Exception{
        //************************************* Spring update Version 2 **************************************** */
        ApplicationContext context = new ClassPathXmlApplicationContext("src/META-INF/app-context.xml");
        System.out.println("\n\t\t\t\t   Spring Framework\n*************************** Application Context instantiated! ******************************");

        GeneralUseImpl generaluse = (GeneralUseImpl) context.getBean("generalUse");
            generaluse.setResDate("04/20/2020");

        InspectionImpl inspection = (InspectionImpl) context.getBean("inspection");
            inspection.setInspectionDate("04/21/2020");

        FacilityUseImpl facilityuse = (FacilityUseImpl) context.getBean("facilityUse");
            facilityuse.scheduleInspection(inspection);
            facilityuse.addReservation(generaluse);

        RequestImpl request = (RequestImpl) context.getBean("request");
            request.setMaintRequest("The toilets are clogged");

        ScheduleMaintenanceImpl schedule = (ScheduleMaintenanceImpl) context.getBean("schedule");
            schedule.setMaintDate("04/10/2020");
            schedule.calcMaintenanceCostForFacility(100.0);
            schedule.calcDownTimeForFacility(2);

        FacilityMaintenanceImpl maintenance = (FacilityMaintenanceImpl) context.getBean("maintenance");
            maintenance.makeFacilityMaintRequest(request);
            maintenance.scheduleMaintenance(schedule);

        FacilityImpl facility = (FacilityImpl) context.getBean("facility");
            facility.setFacilityCapacity(3000);
            facility.setFacilityName("damen den");
            facility.addFacilityDetail("This facility is a small room in Damen Student Center");
            facility.setFacilityMaint(maintenance);
            facility.setFacilityUse(facilityuse);
        FacilityManagementImpl management = (FacilityManagementImpl) context.getBean("management");
            management.addNewFacility(facility);
            management.getFacilityInformation(facility);
            management.listFacilities();

        System.out.println("\nApplication Context\n");
        System.out.println(management.listFacilities()+"\n"+management.getFacilityInformation(facility)+"\n");

        //************************************* Version 1 **************************************** */
        FacilityManagementImpl manage = new FacilityManagementImpl();
        LinkedList<FacilityImpl> facilities = new LinkedList<FacilityImpl>();

        //Set Up General Use Object creates a reservation for a facility
        GeneralUseImpl genUse1 = new GeneralUseImpl();
            genUse1.setResDate("04/11/2020");//sets a varible for a date for reservation
        GeneralUseImpl genUse2 = new GeneralUseImpl();
            genUse2.setResDate("03/10/2020");
        GeneralUseImpl genUse3 = new GeneralUseImpl();
            genUse3.setResDate("03/27/2020");

        //Set Up Inspection Object creates an inspection for a facility
        InspectionImpl inspection1 = new InspectionImpl();
            inspection1.setInspectionDate("04/10/2020");//sets a variable for a date for inspection
        InspectionImpl inspection2 = new InspectionImpl();
            inspection2.setInspectionDate("04/3/2020");
        InspectionImpl inspection3 = new InspectionImpl();
            inspection3.setInspectionDate("04/6/2020");

        //Set Up Facility Use Object adding 2 smaller objects of an inspection and a reservation
        FacilityUseImpl facUse1 = new FacilityUseImpl();
            facUse1.scheduleInspection(inspection1);//add inspection object
            facUse1.addReservation(genUse1);//adds reservation object
        FacilityUseImpl facUse2 = new FacilityUseImpl();
            facUse2.scheduleInspection(inspection2);
            facUse2.addReservation(genUse2);
        FacilityUseImpl facUse3 = new FacilityUseImpl();
            facUse3.scheduleInspection(inspection3);
            facUse3.addReservation(genUse3);

        //Set Up Request Object is a reason for a maintenance request
        RequestImpl request1 = new RequestImpl();
            request1.setMaintRequest("The toilets are clogged");//explination for the request
        RequestImpl request2 = new RequestImpl();
            request2.setMaintRequest("The toilet paper repair");
        RequestImpl request3 = new RequestImpl();
            request3.setMaintRequest("The speaker got wet");


        //Set Up Schedule Maintenance Object sets a date, downtime, and cost for a the facility maitenance
        ScheduleMaintenanceImpl schedMaint1 = new ScheduleMaintenanceImpl();
            schedMaint1.setMaintDate("04/09/2020");//adds a variable string for a date
            schedMaint1.calcMaintenanceCostForFacility(100.0);//insert a double for cost of the maintenance
            schedMaint1.calcDownTimeForFacility(5);//amount of days it takes to fix the problem
        ScheduleMaintenanceImpl schedMaint2 = new ScheduleMaintenanceImpl();
            schedMaint2.setMaintDate("04/10/2020");
            schedMaint2.calcMaintenanceCostForFacility(100.0);
            schedMaint2.calcDownTimeForFacility(2);
        ScheduleMaintenanceImpl schedMaint3 = new ScheduleMaintenanceImpl();
            schedMaint3.setMaintDate("04/11/2020");
            schedMaint3.calcMaintenanceCostForFacility(100.0);
            schedMaint3.calcDownTimeForFacility(3);

        //Set Up Facility Maintenance Object facility maitenance will add 2 objects within it as the request and the schedule for the request
        FacilityMaintenanceImpl facMaint1 = new FacilityMaintenanceImpl();
            facMaint1.makeFacilityMaintRequest(request1);// adds the Request Object
            facMaint1.scheduleMaintenance(schedMaint1);// adds the Schedule Maintenance Object
        FacilityMaintenanceImpl facMaint2 = new FacilityMaintenanceImpl();
            facMaint2.makeFacilityMaintRequest(request1);
            facMaint2.scheduleMaintenance(schedMaint1);
        FacilityMaintenanceImpl facMaint3 = new FacilityMaintenanceImpl();
            facMaint3.makeFacilityMaintRequest(request1);
            facMaint3.scheduleMaintenance(schedMaint1);
        
        //---------------------------------------------------------------------------------------------------------------------------------
        //Set Up Facility Objects
        FacilityImpl facility1 = new FacilityImpl();
            facility1.setFacilityCapacity(3000);
            facility1.setFacilityName("damen den");
            facility1.addFacilityDetail("This facility is a small room in Damen Student Center");
            facility1.setFacilityMaint(facMaint1);
            facility1.setFacilityUse(facUse1);
        
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
        // Below is the terminal output of what the code performs on  the back end, all methods create a list or return an object but does not print anyhting without these print statements
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