public class ElectionResult {
    double votesDem, votesGop, totalVotes, perDem, perGop, diff, perPointDiff, stateAbbr, countyName, combinedFips;

    public ElectionResult(double votesDem, double votesGop, double totalVotes, double perDem, double perGop, double diff, double perPointDiff, double stateAbbr, double countyName, double combinedFips) {
        this.votesDem = votesDem;
        this.votesGop = votesGop;
        this.totalVotes = totalVotes;
        this.perDem = perDem;
        this.perGop = perGop;
        this.diff = diff;
        this.perPointDiff = perPointDiff;
        this.stateAbbr = stateAbbr;
        this.countyName = countyName;
        this.combinedFips = combinedFips;
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

    public double getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(double stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public double getCountyName() {
        return countyName;
    }

    public void setCountyName(double countyName) {
        this.countyName = countyName;
    }

    public double getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(double combinedFips) {
        this.combinedFips = combinedFips;
    }
}