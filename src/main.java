import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Benjamin Du
 */
public class main {
    public static void main(String[] args) {
        // Test of utils

        String data = Utils.readFileAsString("C:\\Users\\Ben\\IdeaProjects\\DataParser\\data\\2016_Presidential_Results.csv");
//        System.out.println(data);
        ArrayList<ElectionResult> results = new ArrayList<>();
        results = Utils.parse2016PresidentialResults(data);
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i).toString());
        }
    }
}
