public class J3_1 {

    public static void main(String[] args) {

        String zadanie = "Nauka programowania w Java - ALX !!!"; //zadaniem jest wycięcie napisu Java ze zdania

        int miejsce = zadanie.indexOf("J");
        System.out.println(miejsce); //22

        String wycinek = zadanie.substring(miejsce,miejsce +4);
        System.out.println(wycinek);


        // zadaniem jest podanie liczby spacji w zdaniu
        int dlugoscStringa = zadanie.length();
        System.out.println(dlugoscStringa);  // długość stringa (36)

        String bezSpacji = zadanie.replace(" ", ""); //zamienia wszysztkie spacje na brak spacji
        System.out.println(bezSpacji); //wypisuje bez spacji
        int dlugoscBezSpacji = bezSpacji.length();
        System.out.println(dlugoscBezSpacji);

        int ileSpacji = dlugoscStringa-dlugoscBezSpacji;
        System.out.println(ileSpacji);

        //zadaniem jest wypisanie słowa ALX odwrotnie
        String alx = "ALX"; //1 sposób
        char znak1 = alx.charAt(0);
        char znak2 = alx.charAt(1);
        char znak3 = alx.charAt(2);
        System.out.print(znak3);
        System.out.print(znak2);
        System.out.print(znak1);
        System.out.println();

        String alx1 = "ALX"; //2 sposób "na beszczela"
        String nowy = alx.replace("ALX", "XLA");
        System.out.println(nowy);













    }
}
