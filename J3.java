public class J3 {

    public static void main(String[] args) {

        String imie = "Seweryn";
        int wiek = 32;
        boolean pytanie = true;

        System.out.println("Cześć " + imie + ", słyszałem, że masz " + wiek + " lata i uczysz się programowania, czy to prawda?");
        System.out.println("Tak, " + pytanie);

        String str = "Java";
        char actualValue0 = str.charAt(1); //zwraca znak na pozycji 1
        System.out.println(actualValue0);

        String str2 = "Programista";
        int actualValue1 = str.indexOf("x"); //ma podać pozycję na której jest znak x, a jak nie ma znaku x to zwraca -1
        System.out.println(actualValue1);

        String wycinek = str2.substring(3,6); //wycina od 3 do 6 znaku
        System.out.println(wycinek);

        String podmiana = str2.replace("a", "A"); //podmienia 'a' na 'A'
        System.out.println(podmiana);

        int ileZnakow = str2.length(); //podaje długość Stringa
        System.out.println(ileZnakow);

        String male = str2.toLowerCase(); //zmienia litery na małe
        System.out.println(male);

        String duze = str2.toUpperCase(); //zmienia litery na duże
        System.out.println(duze);

        String bialeZnaki = "  Ja va  "; //usuwa białe znaki na końcu i na początku
        String czyszczenie = bialeZnaki.trim();
        System.out.println(czyszczenie);


    }
}
