import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<DataManager.County> counties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DataManager.County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<DataManager.County> counties) {
        this.counties = counties;
    }
}