package tests.facility_use;

import src.facility_use.*;

public class TestFacilityUse{
    LinkedList<InspectionImpl> inspections = new LinkedList<>();
    LinkedList<GeneralUseImpl> reservations = new LinkedList<>();
    LinkedList<InspectionImpl> test1 = new LinkedList<InspectionImpl>();
    LinkedList<GeneralUseImpl test2 = new LinkedList<GeneralUseImpl>();
    InspectionImpl inspec = new InspectionImpl;
    GeneralUseImpl gU = new GeneralUseImpl;
    FacilityUseImpl fU = new FacilityUseImpl;
    inspections.add(inspec);
    reservations.add(gU);
    fU.setReservations(reservations);
    fU.setInspections(inspections);
    
    //Test isInUseDuringInterval
    //Test vacateFacility
    
}