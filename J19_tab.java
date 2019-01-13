import java.util.Random;

public class J19_tab {

    public static void main(String[] args) {

        int[] liczby = new int[10]; //tworzy tablicę
        int liczba_max = 0;
        int liczba_min = 0;
        int suma = 0;
        double srednia;
        int licznik_wiekszych = 0;
        int licznik_mniejszych = 0;

        Random rnd = new Random();

        for (int i=0; i<liczby.length; i++) {   //wypełnia tablicę 10 losowymi wartościami
            liczby[i] = rnd.nextInt(21) - 10;
        }
        System.out.println("Zawartość tablicy to: ");
       for (int tmp: liczby) {      //wyświetla zawartość tablicy
           System.out.println(tmp);
       }


       for (int j=0; j<liczby.length; j++){     //wyznacza największy oraz najmniejszy element tablicy
            if (j == 0)
            {
           liczba_max = liczby[j];
           liczba_min = liczby[j];
            }
        else
            {
                if (liczby[j]>liczba_max)
                {
                    liczba_max = liczby[j];
                }
                if (liczby[j]<liczba_min)
                {
                    liczba_min = liczby[j];
                }
            }

       }
        System.out.println();
        System.out.println("Największy element to: "+liczba_max);
        System.out.println("Najmniejszy element to: "+liczba_min);

        for (int k=0; k<liczby.length; k++)   //wyznacza średnią arytmetyczną liczb
        {
            suma += liczby[k];
        }

        srednia = (double)suma/10;

        System.out.println("średnia arytmetyczna elementów to: "+srednia);



        for (int l=0; l<liczby.length; l++)         //wyznacza ile elementów jest mniejszych a ile większych od średniej
        {
            if (liczby[l]>srednia)
            {
                licznik_wiekszych += 1;
            }

            else if (liczby[l]<srednia)
            {
                licznik_mniejszych +=1;
            }
        }

        System.out.println("Liczb większych od średniej jest: "+licznik_wiekszych);
        System.out.println("Liczb mniejszych od średniej jest: "+licznik_mniejszych);
        System.out.println();



        System.out.println("Liczby w tablicy w odwrotnej kolejności to: ");
        for (int m=liczby.length-1; m>=0; m--)          //wypisuje zawartość tablicy w odwrtonej kolejności
        {
            System.out.println(liczby[m]);
        }

        /*System.out.println();
        System.out.println("Liczby w odwrotnej kolejności 2 sposób to:");
        System.out.println();


        int[] tmp2 = new int[10];
        for (int n=0; n<liczby.length; n++){
            tmp2[liczby.length-1-n] = liczby[n];
        }
        for (int temp: tmp2)
            System.out.println(temp);
        */










    }
}
