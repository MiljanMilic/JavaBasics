package domaci.drugaNedelja;


import java.util.Scanner;

public class Zadatak6 {

    //Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
    //(Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).

    static int prebrojSamoglasnike(String str) {
        str = str.toLowerCase();
        int brojSamoglasnika = 0;

        for (int i = 0; i < str.length(); i++) {
            char samoglasnik = str.charAt(i);
            if (samoglasnik == 'a' || samoglasnik == 'e' || samoglasnik == 'i' || samoglasnik == 'o' || samoglasnik == 'u') {
                brojSamoglasnika++;
            }
        }

        return brojSamoglasnika;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite tekst: ");
        String tekst = sc.nextLine();

        int brojSamoglasnika = prebrojSamoglasnike(tekst);
        System.out.println("Broj samoglasnika u tekstu je: " + brojSamoglasnika);
    }


    }


