import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<County> counties;

    public State(String name, ArrayList<County> counties){
        this.name = name;
        this.counties = counties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCounty(County c){
        counties.add(c);
    }

    public void removeCounty(County c){
        counties.remove(c);
    }

    public County removeCounty(int index){
        return  counties.remove(index);
    }


    public ArrayList<County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<County> counties) {
        this.counties = counties;
    }
}