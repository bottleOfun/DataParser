import java.util.ArrayList;

public class DataManager {
    private ArrayList<State> states;



    public class State {
        private String name;
        private ArrayList<County> counties;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<County> getCounties() {
            return counties;
        }

        public void setCounties(ArrayList<County> counties) {
            this.counties = counties;
        }
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    public class County {
        private String name;
        private int fips;
        private Election2016 vote2016;
        private Education2016 educ2016;
        private Employment2016 employ2016;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFips() {
            return fips;
        }

        public void setFips(int fips) {
            this.fips = fips;
        }

        public Election2016 getVote2016() {
            return vote2016;
        }

        public void setVote2016(Election2016 vote2016) {
            this.vote2016 = vote2016;
        }

        public Education2016 getEduc2016() {
            return educ2016;
        }

        public void setEduc2016(Education2016 educ2016) {
            this.educ2016 = educ2016;
        }

        public Employment2016 getEmploy2016() {
            return employ2016;
        }

        public void setEmploy2016(Employment2016 employ2016) {
            this.employ2016 = employ2016;
        }
    }

    public class Election2016{
        private double demVotes;
        private double gopVotes;
        private double totalVotes;

        public double getDemVotes() {
            return demVotes;
        }

        public void setDemVotes(double demVotes) {
            this.demVotes = demVotes;
        }

        public double getGopVotes() {
            return gopVotes;
        }

        public void setGopVotes(double gopVotes) {
            this.gopVotes = gopVotes;
        }

        public double getTotalVotes() {
            return totalVotes;
        }

        public void setTotalVotes(double totalVotes) {
            this.totalVotes = totalVotes;
        }
    }

    public class Education2016{
        private double noHighSchool;
        private double onlyHighSchool;
        private double someCollege;
        private double bachelorsOrMore;

        public double getNoHighSchool() {
            return noHighSchool;
        }

        public void setNoHighSchool(double noHighSchool) {
            this.noHighSchool = noHighSchool;
        }

        public double getOnlyHighSchool() {
            return onlyHighSchool;
        }

        public void setOnlyHighSchool(double onlyHighSchool) {
            this.onlyHighSchool = onlyHighSchool;
        }

        public double getSomeCollege() {
            return someCollege;
        }

        public void setSomeCollege(double someCollege) {
            this.someCollege = someCollege;
        }

        public double getBachelorsOrMore() {
            return bachelorsOrMore;
        }

        public void setBachelorsOrMore(double bachelorsOrMore) {
            this.bachelorsOrMore = bachelorsOrMore;
        }
    }

    public class Employment2016{
        private int totalLaborForce;
        private int employedLaborForce;
        private int unemployedLaborForce;
        private double unemployedPercent;

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
    }


}
