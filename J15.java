import java.util.Scanner;

public class J15 {

    public static void main(String[] args) {

        int a;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę, sprawdzę czy jest parzysta");
        a = odczyt.nextInt();
        odczyt.close();

        switch (a) {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("Podałeś liczbę parzystą");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Podałeś liczbą nieparzystą");
                break;
            default:
                System.out.println("Podałeś liczbę spoza zakresu");
        }


    }
}
