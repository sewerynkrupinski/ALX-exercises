import java.util.Scanner;

public class Skaner {

    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        int wiek;
        String imie;

        System.out.println("Podaj swój wiek");
        wiek = odczyt.nextInt();

        System.out.println("Podaj swój telefon");
        int tel = odczyt.nextInt();

        odczyt.nextLine(); //musi skonsumować entera bo inaczej zapisze go do Stringa

        System.out.println("Podaj swoje imię:");
        imie = odczyt.nextLine();

        System.out.println("Witaj " + imie +", który masz " + wiek + " lat i masz tel. nr " + tel);
        odczyt.close();



    }
}
