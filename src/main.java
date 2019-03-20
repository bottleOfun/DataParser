import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Benjamin Du
 */
public class main {
    public static void main(String[] args) {
        // Test of utils

//        String data = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\2016_Presidential_Results.csv");
        String data2 = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\Education V.2 - Education.csv");
        String data3 = Utils.readFileAsString("C:\\Users\\bdu698\\IdeaProjects\\DataParser\\data\\Unemployment V.2 - Unemployment.csv");
//        System.out.println(data);
//        System.out.println("Election data");
//        ArrayList<ElectionResult> results;
//        results = Utils.parse2016PresidentialResults(data);
//        for (int i = 0; i < results.size(); i++) {
//            System.out.println(results.get(i).toString());
//        }

//        System.out.println("Education data");
//        System.out.println("//////////////////////////////////////////////////////////////////////");
        ArrayList<EducationResults> results2;
        results2 = Utils.parseEducationV2(data2);
        for (int i = 0; i < results2.size(); i++) {
            System.out.println(results2.get(i).toString());
        }

//        System.out.println("Unemployment data");
//        System.out.println("//////////////////////////////////////////////////////////////////////");
        ArrayList<UnemploymentResults> results3;
        results3 = Utils.parseUnemploymentV2(data3);
//        for (int i = 0; i < results3.size(); i++) {
//            System.out.println(results3.get(i).toString());
//        }

//        ArrayList<State> states = getAllStates(results, results2, results3);
//        DataManager allData = new DataManager();
//        allData.setStates(states);
//        for (int i = 0; i < allData.getStates().size(); i++) {
//            System.out.println(allData.getStates().get(i).getName());
//        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    private static ArrayList<County> getAllCounties(ArrayList<ElectionResult> results, ArrayList<EducationResults> results2, ArrayList<UnemploymentResults> results3) {
//        ArrayList<County> counties = new ArrayList<>();
//        ArrayList<String> names = getCountyNames(results);
//        ArrayList<Integer> fips = getFipNumbers(results);
//        ArrayList<Election2016> election2016Data = getElection2016Data(results);
//        ArrayList<Education2016> education2016Data = getEducation2016Data(results2);
//        ArrayList<Employment2016> employment2016Data = getEmployment2016Data(results3);
//        for (int i = 0; i < names.size(); i++) {
//            counties.add(new County(names.get(i), fips.get(i), election2016Data.get(i), education2016Data.get(i), employment2016Data.get(i)));
//        }
//        return counties;
//    }
//
//    private static ArrayList<String> getCountyNames(ArrayList<ElectionResult> results) {
//        ArrayList<String> names = new ArrayList<>();
//        for (int i = 0; i < results.size(); i++) {
//             names.add(results.get(i).getCountyName());
//        }
//        return names;
//    }
//
//    private static ArrayList<Integer> getFipNumbers(ArrayList<ElectionResult> results) {
//        ArrayList<Integer> fips = new ArrayList<>();
//        for (int i = 0; i < results.size(); i++) {
//            fips.add(Integer.parseInt(results.get(i).getCombinedFips()));
//        }
//        return fips;
//    }
//
//    private static ArrayList<Election2016> getElection2016Data(ArrayList<ElectionResult> results) {
//        ArrayList<Election2016> election2016Data = new ArrayList<>();
//        for (int i = 0; i < results.size(); i++) {
//
//
//        }
//        return election2016Data;
//    }
//
//    private static ArrayList<Education2016> getEducation2016Data(ArrayList<EducationResults> results2) {
//        ArrayList<Education2016> education2016Data = new ArrayList<>();
//        for (int i = 0; i < results2.size(); i++) {
//
//
//        }
//        return education2016Data;
//    }
//
//    private static ArrayList<Employment2016> getEmployment2016Data(ArrayList<UnemploymentResults> results3) {
//        ArrayList<Employment2016> employment2016Data = new ArrayList<>();
//        for (int i = 0; i < results3.size(); i++) {
//
//
//        }
//        return employment2016Data;
//    }
//
//
//    private static ArrayList<State> getAllStates(ArrayList<ElectionResult> results, ArrayList<EducationResults> results2, ArrayList<UnemploymentResults> results3) {
//        ArrayList<State> states = new ArrayList<>();
//        ArrayList<String> names = getStateNames(results);
//        ArrayList<County> counties = getAllCounties(results, results2,results3);
//        //TODO Finish adding data to the DataManager.
//
//        for (int i = 0; i < names.size(); i++) {
//            states.add(new State(names.get(i), counties));
//        }
//
//        return states;
//    }
//
//    private static ArrayList<String> getStateNames(ArrayList<ElectionResult> results) {
//        ArrayList<String> stateNames =  new ArrayList<>();
//        for (int i = 0; i < results.size(); i++) {
//            if(!(stateNames.contains(results.get(i).getStateAbbr()))){
//                stateNames.add(results.get(i).getStateAbbr());
//            }
//        }
//        return stateNames;
//    }

}
