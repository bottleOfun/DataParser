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
    public static ArrayList<EducationResults> parseEducation(String data) {
        ArrayList<EducationResults> results = new ArrayList<>();
        String[] splitdata = data.split("\n");
        for (int i = 5; i < splitdata.length-10; i++) {
            String[] splitFile = splitdata[i].split(",");
            String[] stringFile = addstringFile(splitFile, 3);
            double[] doubleFile = convertToDouble(splitFile, splitFile.length-4);
            EducationResults educationData = new EducationResults(doubleFile, stringFile);
            results.add(educationData);
        }
        return results;
    }


    public static ArrayList<UnemploymentResults> parseUnemployment(String data) {
        ArrayList<UnemploymentResults> results = new ArrayList<>();
        String[] splitdata = data.split("\n");
        for (int i = 8; i < splitdata.length; i++) {
            String temp = splitdata[i].replace("%,", ",");
            temp = temp.replace("\"$", "\"");
            temp = getRidOfSpaces(temp);
            String newFile = findQuotations(temp);
            String[] splitFile = newFile.split(",");
            String[] stringfile = addstringFile(splitFile);
            double[] doubleFile = convertToDouble(splitFile, splitFile.length-1);
            int[] intFile = convertToInt(splitFile, splitFile.length-9, splitFile.length-6);
            UnemploymentResults unemploymentData = new UnemploymentResults(doubleFile, stringfile, intFile);
            results.add(unemploymentData);
        }
        return results;
    }

    private static String getRidOfSpaces(String temp) {
        for (int i = 0; i < temp.length(); i++) {
             if(temp.substring(i,i+1).equals(" ")){
                temp = removeCharAt(temp, i);
                i=0;
             }
        }
        return temp;
    }

    private static int[] convertToInt(String[] splitFile, int start, int end) {
        int[] temp = new int[end-start];
        for (int i = 0; i < end-start; i++) {
            temp[i] = Integer.parseInt(splitFile[i+start]);
        }
        return temp;
    }

    private static String[] addstringFile(String[] splitFile, int n) {
        String[] stringFile = new String[n];
        for (int i = 0; i < n; i++) {
            if((splitFile[i] != "" || splitFile[i] != null) && splitFile[i].length() > 0) {
                stringFile[i] = splitFile[i];
            }
        }
        return stringFile;
    }

    private static double[] convertToDouble(String[] splitFile, int start) {
        int length = splitFile.length-start;
        double[] temp = new double[length];
        for (int i = 0; i < splitFile.length-start; i++) {
            if((splitFile[i+start] != "" || splitFile[i+start] != null) && splitFile[i+start].length() > 0) {
                temp[i] = Double.parseDouble(splitFile[i + start]);
            }
        }
        return temp;
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
        String[] pieces = temp.split(",");
        pieces[0] = removeCharAt(pieces[0], pieces[0].indexOf("\""));
        pieces[pieces.length-1] = removeCharAt(pieces[pieces.length-1], pieces[pieces.length-1].indexOf("\""));
        String togetherPieces = "";
        for (int i = 0; i < pieces.length; i++) {
           togetherPieces += pieces[i];

        }
        file = file.replace(temp,togetherPieces);
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
                quotationList.remove(0);
                quotationList.remove(0);
                count = 0;
                i=0;
            }
        }
        return file;
    }

    private static String removeCharAt(String str, Integer n){
        String front = str.substring(0,n);
        String back = str.substring(n+1);
        return front + back;
    }
}
