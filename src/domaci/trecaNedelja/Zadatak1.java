package domaci.trecaNedelja;


public class Zadatak1 {
    //Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.

    static Boolean daLiSuNizoviJednaki (int[] niz1, int[] niz2){

        if (niz1.length != niz2.length)
            return false;
        for (int i = 0; i <niz1.length ; i++) {
            if (niz1[i] != niz2[i])
        return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] niz1 = {1, 2, 3, 4, 5};
        int[] niz2 = {1, 2, 3, 4, 5};
        int[] niz3 = {1, 2, 3, 4, 6};
        int[] niz4 = {1, 2, 3, 4};

        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Element " + (i + 1) + " prvog niza: " + niz1[i] + " drugog niza: " + niz3[i]);
        }
        if (daLiSuNizoviJednaki(niz1, niz3))
            System.out.println("Nizovi su jednaki");
        else System.out.println("Nizovi nisu jednaki");
    }
}
