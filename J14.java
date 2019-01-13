import java.util.Scanner;

public class J14 {

    public static void main(String[] args) {

        String a;

        System.out.println("Podaj słownie liczbę z zakresu Jeden - Pięć:");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextLine();
        odczyt.close();

        switch (a) {
            case ("Zero"):
                System.out.println("Podałeś liczbę: 0");
                break;

            case ("Jeden"):
                System.out.println("Podałeś liczbę: 1");
                break;

            case ("Dwa"):
                System.out.println("Podałeś liczbę: 2");
                break;

            case ("Trzy"):
                System.out.println("Podałeś liczbę: 3");
                break;

            case ("Cztery"):
                System.out.println("Podałeś liczbę: 4");
                break;

            case ("Pięć"):
                System.out.println("Podałeś liczbę: 5");
                break;

            default:
                System.out.println("Podałeś liczbę spoza zakresu");


        }

    }

}