
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // array degli invitati
        String[] guestsLists = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };
        
        // chiedo utente il nome
        Scanner scan = new Scanner(System.in);
        System.out.print("inserire nome utente: ");

        String userName = scan.nextLine();
        System.out.println("il nome utente è: " + userName);

        boolean isInList = false;
        
        // ciclo con il for per vedere se utente è nella lista
        for (int i = 0; i < guestsLists.length; i++) {
            String guestName = guestsLists[i];
            if (guestName.equals(userName)) {
                isInList = true;
            }
        }
        
        // ciclo con il while per vedere se utente è nella lista
        /*int i = 0;
        while (i < guestsLists.length) {
            String guestName = guestsLists[i];
            if (guestName.equals(userName)) {
                isInList = true;
            }
            i++;
        }*/

        // condizionale per stampare se utente è in lista o no
        if (isInList) {
            System.out.println("utente è in lista");
        } else {
            System.out.println("utente non è in lista");
        }
        
    }
}
