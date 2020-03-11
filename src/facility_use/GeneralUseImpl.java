package src.facility_use;

public class GeneralUseImpl implements GeneralUse {
    private String resDate;

    public String getResDate(){
        return resDate;
    }

    public void setResDate(String resDate){
        this.resDate = resDate;
    }

    public void assignFacilityToUse(int atendees){

    }

    public void listActualUsage(){

    }

    public Double calcUsageRate(){
        Double usageRate = 0.00;
        return usageRate;
    }
}