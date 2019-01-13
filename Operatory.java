public class Operatory {

    public static void main(String[] args) {

        int num = 5;

        //inkrementacja
        System.out.println(num++); //napierw wyświetla, później zwiększa
        System.out.println(num);
        System.out.println(++num); //najpierw zwiększa, później wyświetla
        System.out.println(num);

        int a = 2;
        String wynik = (a > 5 ? "A jest większe od 5" : "A nie jest większe od 5");
        System.out.println(wynik);




    }
}
