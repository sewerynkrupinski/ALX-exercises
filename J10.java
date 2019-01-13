import java.util.Scanner;

public class J10 {

    public static void main(String[] args) {

        String tekst; //będzie przechowywać podany tekst
        int dlugoscTekstu;

        String bezZnakow; //będzie przechowywać tekst po kowersji bez spacji
        int dlugoscBezZnakow;
        int iloscBialychZnakow;

        Scanner odczyt = new Scanner(System.in);

        System.out.println("Wpisz dowolny tekst");
        tekst = odczyt.nextLine();

        odczyt.close();

        dlugoscTekstu = tekst.length();  //sprawdza dlugosc tekstu
        bezZnakow = tekst.replace(" ",""); //usuwa spacje w tekscie
        dlugoscBezZnakow = bezZnakow.length(); //sprawdza dlugosc tekstu bez spacji

        iloscBialychZnakow = dlugoscTekstu - dlugoscBezZnakow;

        System.out.println("Długość Twojego tekstu to: "+ dlugoscTekstu + " znaków");
        System.out.println("Liczba białych znaków to: " + iloscBialychZnakow);










    }
}
