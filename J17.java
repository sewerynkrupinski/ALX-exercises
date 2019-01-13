public class J17 {
    public static void main(String[] args) {

        int[] numbers = {1, -7, 3, 13, 5, 66, 7, 69, 9, 10};
        for (int tmp: numbers) {
            System.out.println(tmp);
        }

        String[] imiona = {"Robert", "Kasia", "Łukasz", "Zenek"};
        System.out.println(imiona[1]); //wypisuje Kasie
        for (String str: imiona){
            System.out.println(str); //wypisuje wszystko po kolei
        }


    }
}
