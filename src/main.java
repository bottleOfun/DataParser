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

//        ArrayList<ElectionResult> results;
//        results = Utils.parse2016PresidentialResults(data);
//        for (int i = 0; i < results.size(); i++) {
//            System.out.println(results.get(i).toString());
//        }

//        System.out.println("//////////////////////////////////////////////////////////////////////");
//        ArrayList<EducationResults> results2;
//        results2 = Utils.parseEducation(data2);
//        for (int i = 0; i < results2.size(); i++) {
//            System.out.println(results2.get(i).toString());
//        }

        System.out.println("//////////////////////////////////////////////////////////////////////");
        ArrayList<UnemploymentResults> results3;
        results3 = Utils.parseUnemployment(data3);
        for (int i = 0; i < results3.size(); i++) {
            System.out.println(results3.get(i).toString());
        }

    }
}
