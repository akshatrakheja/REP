import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("New password, N | Get Existing Password, G");
        char chk = sc.next().toLowerCase().trim().charAt(0);

        switch(chk){
            case 'n': Base.newP();
                break;
            case 'g':
                System.out.println("Enter the Search name: ");
                Base.getP(sc.next().trim().toUpperCase());
                break;
        }
    }
}
