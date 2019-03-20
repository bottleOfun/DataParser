public class EducationResults {
    //first 3 and last 4 of the data is what we need.
    private String state;
    private double lessThanHighSchoolDiploma2016, highSchoolDiplomaOnly2016, someCollege2016, BachelorsOrHigher016, percentOfAdultsLessThanHighSchool2016,
            percentOfAdultsWithHighSchoolDiploma2016, percentOfAdultsSomeCollegeOrAssociate2016, percentOfAdultsBackelorsOrHigher2016;

    public EducationResults(double[] splitDoubleData, String[] stringFile) {
        this.state = stringFile[0];
        this.lessThanHighSchoolDiploma2016 = splitDoubleData[0];
        this.highSchoolDiplomaOnly2016 = splitDoubleData[1];
        this.someCollege2016 = splitDoubleData[2];
        this.BachelorsOrHigher016 = splitDoubleData[3];
        this.percentOfAdultsLessThanHighSchool2016 = splitDoubleData[4];
        this.percentOfAdultsWithHighSchoolDiploma2016 = splitDoubleData[5];
        this.percentOfAdultsSomeCollegeOrAssociate2016 = splitDoubleData[6];
        this.percentOfAdultsBackelorsOrHigher2016 = splitDoubleData[7];
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public double getPercentOfAdultsLessThanHighSchool2016() {
        return percentOfAdultsLessThanHighSchool2016;
    }

    public void setPercentOfAdultsLessThanHighSchool2016(double percentOfAdultsLessThanHighSchool2016) {
        this.percentOfAdultsLessThanHighSchool2016 = percentOfAdultsLessThanHighSchool2016;
    }

    public double getPercentOfAdultsWithHighSchoolDiploma2016() {
        return percentOfAdultsWithHighSchoolDiploma2016;
    }

    public void setPercentOfAdultsWithHighSchoolDiploma2016(double percentOfAdultsWithHighSchoolDiploma2016) {
        this.percentOfAdultsWithHighSchoolDiploma2016 = percentOfAdultsWithHighSchoolDiploma2016;
    }

    public double getPercentOfAdultsSomeCollegeOrAssociate2016() {
        return percentOfAdultsSomeCollegeOrAssociate2016;
    }

    public void setPercentOfAdultsSomeCollegeOrAssociate2016(double percentOfAdultsSomeCollegeOrAssociate2016) {
        this.percentOfAdultsSomeCollegeOrAssociate2016 = percentOfAdultsSomeCollegeOrAssociate2016;
    }

    public double getPercentOfAdultsBackelorsOrHigher2016() {
        return percentOfAdultsBackelorsOrHigher2016;
    }

    public void setPercentOfAdultsBackelorsOrHigher2016(double percentOfAdultsBackelorsOrHigher2016) {
        this.percentOfAdultsBackelorsOrHigher2016 = percentOfAdultsBackelorsOrHigher2016;
    }

    @Override
    public String toString() {
        return "EducationResults{" +
                "state='" + state + '\'' +
                ", lessThanHighSchoolDiploma2016=" + lessThanHighSchoolDiploma2016 +
                ", highSchoolDiplomaOnly2016=" + highSchoolDiplomaOnly2016 +
                ", someCollege2016=" + someCollege2016 +
                ", BachelorsOrHigher016=" + BachelorsOrHigher016 +
                ", percentOfAdultsLessThanHighSchool2016=" + percentOfAdultsLessThanHighSchool2016 +
                ", percentOfAdultsWithHighSchoolDiploma2016=" + percentOfAdultsWithHighSchoolDiploma2016 +
                ", percentOfAdultsSomeCollegeOrAssociate2016=" + percentOfAdultsSomeCollegeOrAssociate2016 +
                ", percentOfAdultsBackelorsOrHigher2016=" + percentOfAdultsBackelorsOrHigher2016 +
                '}';
    }
}
