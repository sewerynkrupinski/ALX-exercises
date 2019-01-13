import java.util.Scanner;

public class J9_1 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        String czyMozna;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj w programie trójką prostokątny");
        System.out.println();

        System.out.println("Podaj pierwszą przyprostokątną");
        a = odczyt.nextDouble();

        System.out.println("Podaj drugą przyprostokątną");
        b = odczyt.nextDouble();

        System.out.println("Podaj przeciwprostokątną");
        c = odczyt.nextDouble();

        //czyMozna = ((a*a)+(b*b) == (c*c) ? "Z podanych boków można zbudować trójkąt prosotkątny" : "Z podanych boków nie można zbudować trójkąta prostokątnego");

        czyMozna = ((Math.pow(a,2) + Math.pow(b,2)) == (Math.pow(c,2)) ? "Z podanych boków można zbudować trójkąt prosotkątny" : "Z podanych boków nie można zbudować trójkąta prostokątnego");
        System.out.println(czyMozna);

        odczyt.close();
    }
}
