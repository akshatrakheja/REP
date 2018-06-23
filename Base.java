import java.io.File;
import java.util.Scanner;

public class Base {
    static boolean transaction = false;
    static String transactionedSrchnm;

    public static void newP() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        String s;

        if (!transaction) {
            System.out.println("Enter the Search name: ");
            s = sc2.next().trim().toUpperCase();
        } else s = transactionedSrchnm;
        if (!FileManupilator.Checker(s, 0)) {
            System.out.println("Enter the Username/Gmail: ");
            String u = sc.next().trim();
            System.out.println("Enter the password:");
            String p = sc3.nextLine();
            FileManupilator.Writer(s, u, p);
        } else
            System.out.println("This name already exists, to change it please open the TEXT.txt file in the src packadge.");
    }



    public static void getP(String srchnm){

        if(FileManupilator.Checker(srchnm, 1));
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Usernmae dosen't exist would you like to create a new one? [Y/N]");
            char chk = sc.next().trim().toLowerCase().charAt(0);
            switch(chk){
                case 'y':transaction = true; transactionedSrchnm= srchnm; newP();
                break;
                case 'n':System.out.println("EXITED"); break;
            }
            }

    }
}
