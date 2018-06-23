import java.io.*;
import java.util.Scanner;



public class FileManupilator {

    public static void Writer(String srchnm, String usrnm, String psswrd) {
        try {
            FileWriter filename = new FileWriter("/media/lafeo_007/New Volume1/PasBase/src/TEXT.txt", true);

            BufferedWriter bw = new BufferedWriter(filename);
            bw.newLine();
            bw.append("/" + srchnm + "/" + usrnm + "/" + psswrd);
            bw.close();
        } catch (IOException ex) {
            System.out.println("IO Exception");
            ex.printStackTrace();

        }
    }

    public static boolean Checker(String srchnm, int print1) {
        String line;
        boolean x = false;
        try {
            FileReader filename = new FileReader("/media/lafeo_007/New Volume1/PasBase/src/TEXT.txt");
            BufferedReader br = new BufferedReader(filename);


            while ((line = br.readLine()) != null) {
                String[] tempArray = new String[4];
                if (line.charAt(0) == '/') {
                    tempArray = line.split("/");

                }
                if (tempArray[1].trim().equals(srchnm)) {
                    if (print1 == 1) {
                        System.out.println("Search name: " + tempArray[1] + "\nUsername/Gmail: " + tempArray[2] + "\nPassword: " +
                                tempArray[3]);
                    }

                    x = true;

                }

            }
        } catch (IOException ex) {

        }
        return x;

    }


}
