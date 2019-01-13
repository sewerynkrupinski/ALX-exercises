import java.util.Scanner;

public class J18 {

    public static void main(String[] args) {

        String[] imiona = new String[10];
        Scanner odczyt = new Scanner(System.in);

        for (int i = 0; i < imiona.length; i++){
            System.out.println("Podaj " + (i+1) + " imię");
            imiona[i] = odczyt.nextLine();

        }

        System.out.println("Wpisane imiona to: ");

        for (String tmp : imiona){              //wypisanie z użyciem for-each
            System.out.println(tmp);
        }

        odczyt.close();

        /*
        for (int j=0; j<imiona.length; j++){    //wypisanie z użyciem for
            System.out.println(imiona[j]);
        }
        */
    }
}
