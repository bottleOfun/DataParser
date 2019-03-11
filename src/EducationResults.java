public class EducationResults {
    //first 3 and last 4 of the data is what we need.
    private String fipsCode,state,areaName;
    private double lessThanHighSchoolDiploma2016, highSchoolDiplomaOnly2016, someCollege2016, BachelorsOrHigher016;

    public EducationResults(double[] splitDoubleData, String[] stringFile) {
        this.fipsCode = stringFile[0];
        this.state = stringFile[1];
        this.areaName = stringFile[2];
        this.lessThanHighSchoolDiploma2016 = splitDoubleData[0];
        this.highSchoolDiplomaOnly2016 = splitDoubleData[1];
        this.someCollege2016 = splitDoubleData[2];
        this.BachelorsOrHigher016 = splitDoubleData[3];
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

    public double getLessThanHighSchoolDiploma2016() {
        return lessThanHighSchoolDiploma2016;
    }

    public void setLessThanHighSchoolDiploma2016(double lessThanHighSchoolDiploma2016) {
        this.lessThanHighSchoolDiploma2016 = lessThanHighSchoolDiploma2016;
    }

    public double getHighSchoolDiplomaOnly2016() {
        return highSchoolDiplomaOnly2016;
    }

    public void setHighSchoolDiplomaOnly2016(double highSchoolDiplomaOnly2016) {
        this.highSchoolDiplomaOnly2016 = highSchoolDiplomaOnly2016;
    }

    public double getSomeCollege2016() {
        return someCollege2016;
    }

    public void setSomeCollege2016(double someCollege2016) {
        this.someCollege2016 = someCollege2016;
    }

    public double getBachelorsOrHigher016() {
        return BachelorsOrHigher016;
    }

    public void setBachelorsOrHigher016(double bachelorsOrHigher016) {
        BachelorsOrHigher016 = bachelorsOrHigher016;
    }

    public String toString() {
        return "EducationResults{" +
                "fipsCode='" + fipsCode + '\'' +
                ", state='" + state + '\'' +
                ", areaName='" + areaName + '\'' +
                ", lessThanHighSchoolDiploma2016=" + lessThanHighSchoolDiploma2016 +
                ", highSchoolDiplomaOnly2016=" + highSchoolDiplomaOnly2016 +
                ", someCollege2016=" + someCollege2016 +
                ", BachelorsOrHigher016=" + BachelorsOrHigher016 +
                '}';
    }
}
