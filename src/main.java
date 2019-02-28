/***
 * Main class for data parsers
 * @author Benjamin Du
 */
public class main {
    public static void main(String[] args) {
        // Test of utils

        String data = Utils.readFileAsString("DataParser\\data/2016_Presidential_Results.csv");
        System.out.println(data);
    }
}
