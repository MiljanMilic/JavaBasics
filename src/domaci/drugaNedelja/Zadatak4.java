package domaci.drugaNedelja;

public class Zadatak4 {

    //Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.

    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int element : x) {
            System.out.println("Element: " + element);
        }
        for (int element : x) {
            if (element % 2 != 0) {
                System.out.println("Neparan element: " + element);
            }
        }

    }
}

