package J39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PodajLiczbe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            try {
                System.out.println("Podaj liczbę 1");
                int liczba1 = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wystapił błąd, spróbuj jeszcze raz");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Podaj liczbę 2");
                int liczba2 = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wystapił błąd, spróbuj jeszcze raz");
                sc.nextLine();
            }
        }
    }
}


