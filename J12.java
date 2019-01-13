import java.util.Scanner;

public class J12 {

    public static void main(String[] args) {

        double a;
        double b;
        String znak;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Witaj w programie prosty kalkulator");
        System.out.println();

        System.out.println("Podaj pierwszą liczbę");
        a = odczyt.nextDouble(); //odczyt pierwszej danej

        odczyt.nextLine(); //kasowanie entera

        System.out.println("Podaj znak działania - do wyboru: +, -, /, *");
        znak = odczyt.nextLine(); //odczyt znaku działania

        System.out.println("Podaj drugą liczbę");
        b = odczyt.nextDouble(); //odczyt drugiej danej

        // sprawdzanie warunków
        if (znak.equals("+")) { //equals bo znak jest typu String!!!
            System.out.println("Wynik dodawania to: " + (a + b));
        }

        else if (znak.equals("-")) {
            System.out.println("Wynik odejmowania to: " + (a - b));
        }

        else if (znak.equals("/")) {
                if (b == 0) {  //sprawdza czy nie chcemy dzielić przez zero
                System.out.println("Nie wolno dzielić przez zero!");}
                else {
                System.out.println("Wynik dzielenia to: " + (a / b));
                }
        }

        else if (znak.equals("*")) {
            System.out.println("Wynik mnożenia to: " + (a * b));
        }

        else {
           System.out.println("Podałeś działanie spoza dostępnych możliwości");
        }

        odczyt.close();


        } //koniec metody main

    } //koniec klasy

