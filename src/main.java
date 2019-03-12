import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Benjamin Du
 */
public class main {
    public static void main(String[] args) {
        // Test of utils

        String data = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\2016_Presidential_Results.csv");
        String data2 = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\Education.csv");
        String data3 = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\Unemployment.csv");
//        System.out.println(data);
//        System.out.println("Election data");
        ArrayList<ElectionResult> results;
        results = Utils.parse2016PresidentialResults(data);
//        for (int i = 0; i < results.size(); i++) {
//            System.out.println(results.get(i).toString());
//        }

//        System.out.println("Education data");
//        System.out.println("//////////////////////////////////////////////////////////////////////");
        ArrayList<EducationResults> results2;
        results2 = Utils.parseEducation(data2);
//        for (int i = 0; i < results2.size(); i++) {
//            System.out.println(results2.get(i).toString());
//        }

//        System.out.println("Unemployment data");
//        System.out.println("//////////////////////////////////////////////////////////////////////");
        ArrayList<UnemploymentResults> results3;
        results3 = Utils.parseUnemployment(data3);
//        for (int i = 0; i < results3.size(); i++) {
//            System.out.println(results3.get(i).toString());
//        }

        ArrayList<State> states = getAllStates(results, results2, results3);
        ArrayList<County>
        DataManager allData = new DataManager();
        allData.setStates(states);

        for (int i = 0; i < allData.getStates().size(); i++) {
            System.out.println(allData.getStates().get(i).getName());
        }
    }

    private static ArrayList<State> getAllStates(ArrayList<ElectionResult> results, ArrayList<EducationResults> results2, ArrayList<UnemploymentResults> results3) {
        ArrayList<State> states = new ArrayList<>();
        ArrayList<String> names = getStateNames(results);
        //TODO Finish adding data to the DataManager.

        for (int i = 0; i < names.size(); i++) {
            ArrayList<County> counties = new ArrayList<>();
            states.add(new State(names.get(i), counties));
        }

        return states;
    }

    private static ArrayList<String> getStateNames(ArrayList<ElectionResult> results) {
        ArrayList<String> stateNames =  new ArrayList<>();
        for (int i = 0; i < results.size(); i++) {
            if(!(stateNames.contains(results.get(i).getStateAbbr()))){
                stateNames.add(results.get(i).getStateAbbr());
            }
        }
        return stateNames;
    }

}
