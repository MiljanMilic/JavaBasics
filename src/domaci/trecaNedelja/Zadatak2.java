package domaci.trecaNedelja;

public class Zadatak2 {
    //Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
    //svih elemenata na istoj poziciji

    static int[] zbir (int[] niz1, int[] niz2){
        int[] zbirSvihElemenataNaIstojPoziciji = new int[niz1.length];

        for (int i = 0; i < niz1.length; i++) {
            zbirSvihElemenataNaIstojPoziciji[i] = niz1[i] + niz2[i];
        }
        return zbirSvihElemenataNaIstojPoziciji;

    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {2, 3, 4, 5, 6};
        int[] zbir = zbir(niz1, niz2);

        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Element " + (i + 1) + " prvog niza: " + niz1[i] + " drugog niza: " + niz2[i]);
        }
        for (int i : zbir) {
            System.out.println("Rezultat: " + i);
        }

    }
}
