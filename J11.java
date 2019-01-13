import java.util.Scanner;

public class J11 {

    public static void main(String[] args) {

        double a;
        String czyParzysta;
        boolean test;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj w programie 'Czy liczba jest parzysta?'");
        System.out.println();

        System.out.println("Podaj liczbę");
        a = odczyt.nextDouble();

        odczyt.close();

        czyParzysta = (a % 2 == 0 ? "Podana liczba jest parzysta" : "Podana liczba jest nieparzysta");
        System.out.println(czyParzysta);




    }
}
