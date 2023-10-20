package domaci.trecaNedelja;


import java.util.Scanner;

public class Zadatak3 {

    //Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat vraca broj duplikata
    //imena(Ukoliko ih ima).

    static int brojDuplikata(String[] ime) {
        int broj = 0;
        for (int i = 0; i < ime.length; i++) {
            for (int j = i + 1; j < ime.length; j++) {
                if (ime[i].equalsIgnoreCase(ime[j])) {
                    broj++;
                    break;
                }
            }
        }
        return broj;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzinaNiza = sc.nextInt();
        sc.nextLine();
        String[] imena = new String[duzinaNiza];
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.print("Unesite ime " + (i + 1) + ": ");
            imena[i] = sc.nextLine();
        }

        int brojDuplikata = brojDuplikata(imena);
        System.out.println(brojDuplikata);


    }


}
