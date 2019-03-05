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
        for (int i = 0; i < splitdata.length; i++) {
            splitdata[i].replace("%,", ",");
            ArrayList<Integer> quotationList = new ArrayList<>();
            String newFile = findQuotations(quotationList, data);
        }


        return ;
    }

    private static String removeQuotations(ArrayList<Integer> quotationList, String file) {
        String newFile = file;
        String piece = newFile.substring(quotationList.get(1), quotationList.get(2));
        String temp = newFile.substring(quotationList.get(1), quotationList.get(2));
        temp.split(",");
        newFile.replace(piece, temp);
        return newFile;
    }

    private static String findQuotations(ArrayList<Integer> quotationList, String file) {
        int count = 0;
        for (int i = 0; i < file.length(); i++) {
            if (file.substring(i, i + 1).equals('"')) {
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
