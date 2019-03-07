import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
        ArrayList<ElectionResult> results = new ArrayList<>();
        String[] splitdata = data.split("\n");
        for (int i = 1; i < splitdata.length; i++) {
            String temp = splitdata[i].replace("%,", ",");
            String newFile = findQuotations(temp);
            String[] splitFile = newFile.split(",");
            double[] doubleFile = convertToDouble(splitFile);
            String[] stringfile = addstringFile(splitFile);
            ElectionResult electionData = new ElectionResult(doubleFile, stringfile);
            results.add(electionData);
        }
        return results;
    }

    private static String[] addstringFile(String[] splitFile) {
        String[] stringFile = new String[3];
        for (int i = 0; i < stringFile.length; i++) {
            stringFile[i] = splitFile[7+i];

        }
        return stringFile;
    }

    private static double[] convertToDouble(String[] splitFile) {
        double[] temp = new double[splitFile.length];
        for (int i = 0; i < temp.length-3; i++) {
            temp[i] = Double.parseDouble(splitFile[i]);
        }
        return temp;
    }

    private static String removeQuotations(ArrayList<Integer> quotationList, String file) {
        String newFile = file;
        String temp = newFile.substring(quotationList.get(0), quotationList.get(1)+1);
        String[]pieces = temp.split(",");
        file = file.replace(temp,pieces[0].substring(1) + pieces[1].substring(0,pieces[1].length()-1));
        return file;
    }

    private static String findQuotations(String file) {
        ArrayList<Integer> quotationList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < file.length(); i++) {
            if (file.substring(i, i + 1).equals("\"")) {
                quotationList.add(i);
                count++;
            }
            if(count == 2){
                file = removeQuotations(quotationList, file);
                count = 0;
            }
        }
        return file;
    }
}
