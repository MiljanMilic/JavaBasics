package domaci.prvaNedelja;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*Napisati program gde korisnik unosi dva realna broja, zatim unosi naziv operacije koju zeli
        da izvrsi nad tim brojevima(sabiranje, oduzimanje, mnozenje, deljenje), zatim istampati
        rezultat date operacije.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        double x = sc.nextDouble();
        System.out.println("Unesite drugi broj: ");
        double y = sc.nextDouble();
        sc.nextLine();
        System.out.println("Unesite neku operaciju: (sabiranje, oduzimanje, mnozenje, deljenje)");
        String operacija = sc.nextLine();

        double rezultat;
        switch (operacija){
            case "sabiranje":
                rezultat = x + y;
                System.out.println(rezultat);
                break;
            case "oduzimanje":
                rezultat = x - y;
                System.out.println(rezultat);
                break;
            case "mnozenje":
                rezultat = x * y;
                System.out.println(rezultat);
                break;
            case "deljenje":
                rezultat = x / y;
                System.out.println(rezultat);
                break;
        }

    }
}
