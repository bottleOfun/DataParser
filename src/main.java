import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Benjamin Du
 */
public class main {
    public static void main(String[] args) {
        // Test of utils

        String data = Utils.readFileAsString("C:\\Users\\Ben\\IdeaProjects\\DataParser\\data\\2016_Presidential_Results.csv");
        String data2 = Utils.readFileAsString("C:\\Users\\Ben\\IdeaProjects\\DataParser\\data\\Education.csv");
        String data3 = Utils.readFileAsString("C:\\Users\\Ben\\IdeaProjects\\DataParser\\data\\Unemployment.csv");
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

        ArrayList<State> states = putTogetherData(results, results2, results3);
        DataManager allData = new DataManager();
        allData.setStates(states);
        for (int i = 0; i < allData.getStates().size(); i++) {
            System.out.println(allData.getStates().get(i).getName());

        }
    }

    private static ArrayList<State> putTogetherData(ArrayList<ElectionResult> results, ArrayList<EducationResults> results2, ArrayList<UnemploymentResults> results3) {
        ArrayList<State> states = new ArrayList<>();
        //TODO Finish the outOFMemory error and finish adding data to the DataManager.
        for (int i = 0; i < results.size(); i++) {
            if(states.size() == 0) {
                ArrayList<County> counties = new ArrayList<>();
                states.add(new State(results.get(i).getStateAbbr(), counties));
            }
            if(states.size() > 0 ){
                for (int j = 0; j < states.size(); j++) {
                    if(!(states.get(j).getName().equals(results.get(i).getStateAbbr()))) {
                        ArrayList<County> counties = new ArrayList<>();
                        states.add(new State(results.get(i).getStateAbbr(), counties));
                    }
                }
            }
        }

        return states;
    }

}
