public class Zadanie {

    public static void main(String[] args) {

        int a = 50;
        int b = 7;
        int c = 2;
        System.out.println("a="+a + " b="+b + " c="+c);

        String wynik = ((a > b && a > c) ? "a jest największe" : (b > a && b > c) ? "b jest największe" : "c jest największe");
        System.out.println(wynik);

        double liczba1 = 10.987;
        int liczba2 = 5;
        int rzutowanie = (int)liczba1;
        System.out.println(rzutowanie);
        double rzutowanie2 = (double)liczba2;
        System.out.println(rzutowanie2);







    }
}
