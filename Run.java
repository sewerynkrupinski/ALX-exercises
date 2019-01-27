package J25_2;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double liczba1;
        double liczba2;
        String znak;
        String dec;

        Kalkulator obj = new Kalkulator();

        System.out.println("Witaj w programie kalkulator!");
        System.out.println();

        while(true){ //wykonuje się dopóki nie wciśniemy "n" po wyjświetleniu wyniku
            System.out.println("Podaj pierwszą liczbę");
            liczba1 = input.nextDouble();
            input.nextLine();
            System.out.println("Podaj znak działania ( +, -, *, / ");
            znak = input.nextLine();
                while (!(znak.equals("+") || znak.equals("-") || znak.equals("*") || znak.equals("/"))){  //wykonuje się dopóki nie jest podany poprawny znak +, -, / lub *
                    System.out.println("Niewłaściwy znak");
                    System.out.println("Podaj znak działania ( +, -, *, / ");
                    znak = input.nextLine(); //odczytuje znak, jeśli jest prawidłowy wychodzi z pętli while
                }

            System.out.println("Podaj drugą liczbę");
            liczba2 = input.nextDouble();
            input.nextLine(); //odczytuje drugą liczbę


            if (znak.equals("+")){
                System.out.println("Suma twoich liczb to: " +obj.suma(liczba1,liczba2));

            }

            else if (znak.equals("-")){
                System.out.println("Różnica twoich liczb to: " +obj.roznica(liczba1,liczba2));

            }
            else if (znak.equals("*")){
                System.out.println("Iloczyn twoich liczb to: " +obj.iloczyn(liczba1,liczba2));

            }

            else if (znak.equals("/")){
                while (liczba2 == 0){ //jeżeli podana wcześniej liczba jest równa 0 a znakiem było dzielenie to wykonuje się dopóki nie podamy 2 liczby różnej od zera
                    System.out.println("Nie można dzielić przez zero");
                    System.out.println();
                    System.out.println("Podaj drugą liczbę różną od zera");
                    liczba2 = input.nextDouble();
                    input.nextLine();
                 }

                System.out.println("Iloraz twoich liczb to: " + obj.iloraz(liczba1, liczba2));

            }

            System.out.println("Czy chesz dokonać kolejnych obliczeń? (T/N)");
            dec = input.nextLine().toUpperCase();
            if (dec.equals("T")){       //jeżeli wybierzemy "t" to wychodzi z aktualnej pętli i program wykonuje się ponownie
                continue;
            }
            else if (dec.equals("N")){      //jeżeli wybierzemy "n" to program kończy działanie
                System.out.println("Do zobaczenia!");
                break;
            }
        }
    }
}
