public class UnemploymentResults {
    //first 3 and last 10-7, arr.size()-11 to arr.size()-8
    private String fipsCode,state,areaName;
    private int totalLaborForce, employedLaborForce, unemployedLaborForce;
    private double unemployedPercent;

    public UnemploymentResults(double[] splitDoubleData, String[] stringFile, int[] intFiles){
        this.fipsCode = stringFile[0];
        this.state = stringFile[1];
        this.areaName = stringFile[2];
        this.totalLaborForce = intFiles[0];
        this.employedLaborForce = intFiles[1];
        this.unemployedLaborForce = intFiles[2];
        this.unemployedPercent = splitDoubleData[0];
    }

    public String getFipsCode() {
        return fipsCode;
    }

    public void setFipsCode(String fipsCode) {
        this.fipsCode = fipsCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public int getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public int getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
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
                "fipsCode='" + fipsCode + '\'' +
                ", state='" + state + '\'' +
                ", areaName='" + areaName + '\'' +
                ", totalLaborForce=" + totalLaborForce +
                ", employedLaborForce=" + employedLaborForce +
                ", unemployedLaborForce=" + unemployedLaborForce +
                ", unemployedPercent=" + unemployedPercent +
                '}';
    }

}
