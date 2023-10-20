package domaci.drugaNedelja;

import java.util.Scanner;

public class Zadatak3 {

    //Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
    //tacka program se zavrsava i vraca prethodno unete tekstove.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String ukupanTekst = "";
        System.out.println("unositi neki tekst sve dok se ne unese tacka(\".\")");
        while (true){
            String trenutniTekst = sc.nextLine();
            if (trenutniTekst.equals("."))
                break;
            ukupanTekst += trenutniTekst + " ";
        }

        System.out.println(ukupanTekst);


    }
}
