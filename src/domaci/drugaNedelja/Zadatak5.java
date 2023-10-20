package domaci.drugaNedelja;

public class Zadatak5 {

    //Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza

    public static void main(String[] args) {



            int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;


        for (int element : x) {
            if (element % 2 == 0)
                sum += element;
            System.out.println("Element: " + element);
        }

        System.out.println("Suma parnih brojeva: " + sum);
            

            
    }
}
