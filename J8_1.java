import java.util.Scanner;

public class J8_1 {

    public static void main(String[] args) {


        double a; //podstawa
        double b; //wykładnik
        double potega;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj w programie liczba do potęgi!");
        System.out.println();

        System.out.println("Podaj podstawę");
        a = odczyt.nextDouble(); //odczytuje podstawe

        System.out.println("Podaj wykładnik");
        b = odczyt.nextDouble(); //odczytuje wykładnik

        potega = Math.pow(a,b); // a do potęgi b
        odczyt.close();

        System.out.println("Twoja liczba do potęgi to: "+potega);




    }
}
