package domaci.drugaNedelja;

import java.util.Scanner;

public class Zadatak2 {

    //Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj i izracunajte njegov faktorijel:");
        int n = sc.nextInt();
        int faktorijel = 1;
        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja " + n + " je: " + faktorijel);
    }
}
