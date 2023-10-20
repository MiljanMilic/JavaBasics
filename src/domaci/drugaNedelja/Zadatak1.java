package domaci.drugaNedelja;

import java.util.Scanner;

public class Zadatak1 {

//    Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj ponavljanja teksta: ");
        int brojPonavljanja = sc.nextInt();
        sc.nextLine();
        System.out.println("Unesite tekst: ");
        String tekst = sc.nextLine();
        int i = 0;
        while (i < brojPonavljanja){
            System.out.println(tekst);
            i++;
        }


    }
}
