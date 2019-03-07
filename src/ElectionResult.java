public class ElectionResult {
    double votesDem, votesGop, totalVotes, perDem, perGop, diff, perPointDiff;
    String stateAbbr, countyName, combinedFips;

    public ElectionResult(double[] splitDoubleData, String[] stringFile) {
        this.votesDem = splitDoubleData[0];
        this.votesGop = splitDoubleData[1];
        this.totalVotes = splitDoubleData[2];
        this.perDem = splitDoubleData[3];
        this.perGop = splitDoubleData[4];
        this.diff = splitDoubleData[5];
        this.perPointDiff = splitDoubleData[6];
        this.stateAbbr = stringFile[0];
        this.countyName = stringFile[1];
        this.combinedFips = stringFile[2];
    }

    public double getVotesDem() {
        return votesDem;
    }

    public void setVotesDem(double votesDem) {
        this.votesDem = votesDem;
    }

    public double getVotesGop() {
        return votesGop;
    }

    public void setVotesGop(double votesGop) {
        this.votesGop = votesGop;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getPerDem() {
        return perDem;
    }

    public void setPerDem(double perDem) {
        this.perDem = perDem;
    }

    public double getPerGop() {
        return perGop;
    }

    public void setPerGop(double perGop) {
        this.perGop = perGop;
    }

    public double getDiff() {
        return diff;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public double getPerPointDiff() {
        return perPointDiff;
    }

    public void setPerPointDiff(double perPointDiff) {
        this.perPointDiff = perPointDiff;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(String combinedFips) {
        this.combinedFips = combinedFips;
    }

    @Override
    public String toString() {
        return "ElectionResult{ votesDem = " + votesDem +
                ", votesGop = " + votesGop +
                ", totalVote = " + totalVotes +
                ", perDem = " + perDem +
                ", perGop = " + perGop +
                ", diff = " + diff +
                ", perPointDiff = " + perPointDiff +
                ", stateAbbr = " + stateAbbr +
                ", countyName = " + countyName +
                ", combinedFips = " + combinedFips +
                ")";
    }
}