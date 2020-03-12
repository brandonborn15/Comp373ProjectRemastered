package src.client;

import java.util.List;

import src.facility.*;
import src.facility_maintenance.*;
import src.facility_management.*;
import src.facility_use.*;

public class FacilityManagementClient{

    public static void main(String[] args) {
        
        //-----------------------------------------------------BIG OBJECT-----------------------------------------------------------------
        FacilityManagementImpl manage = new FacilityManagementImpl();

        //Set Up General Use Object
        GeneralUseImpl genUse1 = new GeneralUseImpl();
        genUse1.setResDate("04/11/2020");

        //Set Up Inspection Object
        InspectionImpl inspection1 = new InspectionImpl();
        inspection1.setInspectionDate("04/10/2020");

        //Set Up Facility Use Object
        FacilityUseImpl facUse1 = new FacilityUseImpl();
        facUse1.addInspection(inspection1);
        facUse1.addReservation(genUse1);

        //Set Up Request Object
        RequestImpl request = new RequestImpl();
        request.setMaintRequest("The toilets are clogged");

        //Set Up Schedule Maintenance Object
        ScheduleMaintenanceImpl schedMaint1 = new ScheduleMaintenanceImpl();
        schedMaint1.setMaintDate("04/09/2020");

        //Set Up Facility Maintenance Object
        FacilityMaintenanceImpl facMaint1 = new FacilityMaintenanceImpl();
        facMaint1.addRequest(request);
        facMaint1.addSchedMaint(schedMaint1);

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

    }


}