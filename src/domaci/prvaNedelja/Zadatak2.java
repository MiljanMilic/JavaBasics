package domaci.prvaNedelja;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        /*Napisati program gde korisnik unosi ceo broj, ukoliko je broj paran, promeniti ga u neparan i
        istampati, ukoliko je neparan, samo ispisati poruku da je u pitanju neparan broj.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int broj = sc.nextInt();


        if (broj % 2 == 0){
            System.out.println("Neparan: " + (broj + 1));
        }
        else {
            System.out.println("Neparan broj");
        }
    }
}
