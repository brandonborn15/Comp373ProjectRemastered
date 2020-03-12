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

        //Set Up Schedule Maintenance Object
        ScheduleMaintenanceImpl schedMaint1 = new ScheduleMaintenanceImpl();
        schedMaint1.setMaintDate("04/09/2020");

        //Set Up Facility Maintenance Object
        FacilityMaintenanceImpl facMaint1 = new FacilityMaintenanceImpl();
        facMaint1.makeFacilityMaintRequest(request);
        facMaint1.scheduleMaintenance(schedMaint1);

        //Set Up Facility Object
        FacilityImpl facility1 = new FacilityImpl();
        facility1.setFacilityCapacity(3000);
        facility1.setFacilityName("damen den");
        facility1.addFacilityMaint(facMaint1);
        facility1.addFacilityUse(facUse1);
        
        //------------------------------------------------------Little Objects---------------------------------------------------------------------------
        FacilityImpl facility2 = new FacilityImpl();
        facility2.setFacilityCapacity(7000);
        facility2.setFacilityName("gentile arena");

        FacilityImpl facility3 = new FacilityImpl();
        facility3.setFacilityCapacity(10000);
        facility3.setFacilityName("sullivan center");
        //---------------------------------------------------------------------------------------------------------------------------------
        manage.addNewFacility(facility1);
        manage.addNewFacility(facility2);
        manage.addNewFacility(facility3);
        facilities = manage.getFacilities();

        for (FacilityImpl facility : facilities) {
            System.out.println(facility.getFacilityName());
            LinkedList<FacilityUseImpl> facUses = new LinkedList<FacilityUseImpl>();
            facUses = facility.getFacilityUses();
            for (FacilityUseImpl facUse : facUses) {
                LinkedList<InspectionImpl> inspecs = new LinkedList<InspectionImpl>();
                inspecs = facUse.getInspections();
                for (Inspection ins : inspecs){
                    System.out.println(ins.getInspectionDate());
                }
            }
        }

    }


}