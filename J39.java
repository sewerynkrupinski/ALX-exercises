package J39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J39 {

    public static void main(String[] args) {

      int[] tab = {1, 2, 3, 4, 5};


      Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj indeks");
            int ineks = sc.nextInt();


            System.out.println(tab[ineks]);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Podanego indeksu nie ma w tablicy");
        }

        catch (InputMismatchException e){
            System.out.println("Indeks może być tylko literą");
        }
    }
}
