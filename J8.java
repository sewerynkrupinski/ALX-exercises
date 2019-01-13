import java.util.Locale;
import java.util.Scanner;

public class J8 {

    public static void main(String[] args) {

        double a;  //deklaracja zmiennych
        double b;
        double c;

        Scanner odczyt = new Scanner(System.in);
        odczyt.useLocale(Locale.US);

        System.out.println("Witaj w programie średnia 3 liczb! Pamiętaj żeby liczby podawać z kropką a nie z przecinkiem"); //powitanie
        System.out.println();

        System.out.println("Podaj pierwszą liczbę:");
        a = odczyt.nextDouble(); //odczyt pierwszej liczby

        System.out.println("Podaj drugą liczbę:");
        b = odczyt.nextDouble(); //odczyt drugiej liczby

        System.out.println("Podaj trzecią liczbę:");
        c = odczyt.nextDouble(); //odczyt trzeciej liczby

        odczyt.close();

        System.out.println("Srednia twoich liczb to: " + (a+b+c)/3); //wypisuje a nastepnie liczy srednia i wypisuje ja na koncu zdania


    }
}
