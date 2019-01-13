import java.sql.SQLOutput;
import java.util.Random;

public class J6 {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(100);
        int y = random.nextInt(100);

        System.out.println("x = " +x);
        System.out.println("y = " +y);
        System.out.println("----");

        //boolean wynik = (x > y);
        //System.out.println(wynik);

        String wynik1 = (x > y ? "x jest większe od y" : "x jest mniejsze od y");
        System.out.println("Czy x jest większe od y?");
        System.out.println(wynik1);
        System.out.println("----");


        String wynik2 = ((x*2)>y ? "x * 2 większe od y" : "x * 2 mniejsze od y");
        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        System.out.println(wynik2);
        System.out.println("----");

        String wynik3 = ((y < (x+3)) && (y > (x-2)) ? "tak" : "nie");
        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println(wynik3);
        System.out.println("----");

        String wynik4 = ((x * y) % 2 == 0 ? "tak" : "nie");
        System.out.println("Czy iloczyn liczb x i y jest parzysty?");
        System.out.println(wynik4);
        System.out.println();






    }
}
