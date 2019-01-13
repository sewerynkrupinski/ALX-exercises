public class J4 {

    public static void main(String[] args) {

        String aText = "tekst zmienna a"; //deklaracja czterech zmiennych typu String
        String bText = "tekst zmienna b";
        String cText = aText + bText;
        String dText = cText + "tekst zmienna d";

        String duze = cText.toUpperCase(); //wypisuje trzecią zmienną Wielkimi literami
        System.out.println(duze);

        String male = dText.toLowerCase(); //wypisuje czwartą zmienną małymi literami
        System.out.println(male);

        int ileZnakow = dText.length(); //wypisuje długość ciągu znaków czwartej zmiennej
        System.out.println(ileZnakow);

        char znak2 = cText.charAt(2); //wypisuje literę na 2 indeksie w 3 zmiennej
        System.out.println(znak2);
        char znak5 = cText.charAt(6); //wypisuje literę na 6 indeksie w 3 zmiennej
        System.out.println(znak5);

        String pierwszyWyraz = dText.substring(0,5); //wypisuje pierwszy wyraz czwartej zmiennej - wycina od indeksu 0 do indeksu 5
        System.out.println(pierwszyWyraz);
        String drugiWyraz = dText.substring(6, 13); //wypisuje drugi wyraz czwartej zmiennej - wycina od indeksu 6 do 13
        System.out.println(drugiWyraz);


    }
}
