import java.util.HashMap;
import java.util.Scanner;

public class J21_3 {

    public static void main(String[] args) {

        HashMap<String, Integer> liczby = new HashMap<>();
        Scanner odczyt = new Scanner(System.in);


        String[] slowa = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć"};

        for (int i = 0; i<=6; i++){

            liczby.put(slowa[i], i);

        }


        /*
        liczby.put("zero", 0);
        liczby.put("jeden", 1);
        liczby.put("dwa", 2);
        liczby.put("trzy", 3);
        liczby.put("cztery", 4);
        liczby.put("pięć", 5);
        liczby.put("sześć", 6);
        */


         System.out.println("Podaj słownie 1 liczbę (0-6)");
         String liczba1 = odczyt.nextLine();

         System.out.println("Podaj słownie 2 liczbę (0-6)");
         String liczba2 = odczyt.nextLine();

         odczyt.close();

         int wartosc1 = liczby.get(liczba1);
         int wartosc2 = liczby.get(liczba2);

         int suma = wartosc1 + wartosc2;

        System.out.println("Suma twoich liczb to: "+suma);

        System.out.println("Kolekcja wartośći mapy: "+liczby.values());

        System.out.println("Rozmiar mapy to: "+liczby.size());

        System.out.println("Cała kolekcja mapy to: ");

        for (String tmp: liczby.keySet())
        {
            System.out.println(tmp);
            System.out.println(liczby.get(tmp));
        }




    }
}
