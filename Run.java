package J25_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<>();

        String znak;
        String dec;
        int ile;

        Kalkulator obj = new Kalkulator();

        System.out.println("Witaj w programie kalkulator!");
        System.out.println();

        while(true){
        System.out.println("Podaj liczbę elementów");
        ile = input.nextInt();

        if (ile >=4) {
            System.out.println("Mogę liczyć dla max 3 liczb");
            continue;

        }

        else if (ile == 0) {
            System.out.println("Nie podałeś żadnych liczb");
            continue;
        }



        else {
            for (int i = 1; i <= ile; i++) {
                System.out.println("Podaj " + i + " liczbę");
                liczby.add(input.nextInt());

            }

            input.nextLine();

            if (ile == 1) {
                System.out.println("Twoja liczba to " + liczby.get(0));
                liczby.clear();
                continue;
            }

            System.out.println("Podaj znak działania ( +, -, *, / )");
            znak = input.nextLine();
        }

            if (znak.equals("/") && (ile==2 || ile ==3) && (liczby.get(1) == 0 || liczby.get(2) ==0)){
                System.out.println("Nie możesz dzielić przez zero, podaj nowe liczby");

                for (int i = 2; i <= ile; i++) {
                    System.out.println("Podaj " + i + " liczbę");
                    liczby.set(i-1, input.nextInt());
                }
                input.nextLine();
            }

            if (znak.equals("+") && liczby.size() == 2){
                System.out.println("Suma twoich liczb to: " +obj.suma(liczby.get(0),liczby.get(1)));

            }
            else if (znak.equals("+") && liczby.size() == 3) {
                System.out.println("Suma twoich liczb to: " + obj.suma(liczby.get(0), liczby.get(1), liczby.get(2)));
            }

            if (znak.equals("-") && liczby.size() == 2){
                System.out.println("Różnica twoich liczb to: " +obj.roznica(liczby.get(0),liczby.get(1)));

            }
            else if (znak.equals("-") && liczby.size() == 3) {
                System.out.println("Różnica twoich liczb to: " + obj.roznica(liczby.get(0), liczby.get(1), liczby.get(2)));
            }

            if (znak.equals("*") && liczby.size() == 2){
                System.out.println("Iloczyn twoich liczb to: " +obj.iloczyn(liczby.get(0),liczby.get(1)));

            }
            else if (znak.equals("*") && liczby.size() == 3) {
                System.out.println("Iloczyn twoich liczb to: " + obj.iloczyn(liczby.get(0), liczby.get(1), liczby.get(2)));
            }

            if (znak.equals("/") && liczby.size() == 2){
                System.out.println("Iloraz twoich liczb to: " +obj.iloraz(liczby.get(0),liczby.get(1)));

            }
            else if (znak.equals("/") && liczby.size() == 3) {
                System.out.println("Iloraz twoich liczb to: " + obj.iloraz(liczby.get(0), liczby.get(1), liczby.get(2)));
            }


            System.out.println("Czy chesz dokonać kolejnych obliczeń? (T/N)");
            dec = input.nextLine().toUpperCase();
            if (dec.equals("T")){       //jeżeli wybierzemy "t" to wychodzi z aktualnej pętli i program wykonuje się ponownie
                liczby.clear();
                //continue;
            }
            else if (dec.equals("N")){      //jeżeli wybierzemy "n" to program kończy działanie
                System.out.println("Do zobaczenia!");
                break;
            }
        }
    }
}
