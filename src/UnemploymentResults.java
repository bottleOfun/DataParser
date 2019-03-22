public class UnemploymentResults {
    //first 3 and last 10-7, arr.size()-11 to arr.size()-8
    private String state;
    private double totalLaborForce, employed, unemployed;
    private double unemployedPercent, medianHouseholdIncome2016;

    public UnemploymentResults(double[] splitDoubleData, String[] stringFile){
        this.state = stringFile[0];
        this.totalLaborForce = splitDoubleData[0];
        this.employed = splitDoubleData[1];
        this.unemployed = splitDoubleData[2];
        this.unemployedPercent = splitDoubleData[3];
        this.medianHouseholdIncome2016 = splitDoubleData[4];
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

    @Override
    public String toString() {
        return "UnemploymentResults{" +
                "state='" + state + '\'' +
                ", totalLaborForce=" + totalLaborForce +
                ", employed=" + employed +
                ", unemployed=" + unemployed +
                ", unemployedPercent=" + unemployedPercent +
                ", medianHouseholdIncome2016=" + medianHouseholdIncome2016 +
                '}';
    }
}
