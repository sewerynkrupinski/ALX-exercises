import java.util.Scanner;

public class J13 {
    public static void main(String[] args) {

        int a;

        System.out.println("Podaj liczbę z zakresu 0 - 5:");

        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        odczyt.close();

        switch (a) {
            case 0:
                System.out.println("Podałeś liczbę: ZERO");
             break;

            case 1:
                System.out.println("Podałeś liczbę: JEDEN");
            break;

            case 2:
                System.out.println("Podałeś liczbę: DWA");
            break;

            case 3:
                System.out.println("Podałeś liczbę: TRZY");
             break;

            case 4:
                System.out.println("Podałeś liczbę: CZTERY");
            break;

            case 5:
                System.out.println("Podałeś liczbę: PIĘĆ");
            break;

            default:
                System.out.println("Podałeś liczbę spoza zakresu");

        }

    }
}
