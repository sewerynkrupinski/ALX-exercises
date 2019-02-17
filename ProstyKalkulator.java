import java.util.InputMismatchException;
import java.util.Scanner;

public class ProstyKalkulator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        while(flag) {
            try {
                System.out.println("Podaj liczbę 1");
                int l1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Podaj znak działania");
                String znak = sc.nextLine();
                System.out.println("Podaj liczbę 2");
                int l2 = sc.nextInt();


                switch (znak) {
                    case "+":
                        System.out.println("Wynik dodawania = " + (l1 + l2));
                        break;
                    case "-":
                        System.out.println("Wynik  odejmowania = " + (l1 - l2));
                        break;
                    case "*":
                        System.out.println("Wynik mnożenia = " + (l1 * l2));
                        break;
                    case "/":
                        System.out.println("Wynik dzielenia = " + (l1 / l2));
                        break;
                }

            }

            catch (ArithmeticException e){
                System.out.println("Nie dzielimy przez zero");

            }
            catch (InputMismatchException e){
                System.out.println("Podajemy tylko liczby");
                sc.nextLine();
            }
            finally{
                sc.nextLine();
            }

            System.out.println("Czy liczymy dalej? (T/N)");
            String dec = sc.nextLine().toUpperCase();


            if (dec.equals("T")) {
                continue;
            }

            else if (dec.equals("N")) {
                flag = false;
            }

        }

    }

}
