
import java.util.HashMap;
import java.util.Random;

public class PracaDomowa1 {
    
    public static void main(String[] args) {
   
        
        
        int[] liczby = new int[20];  //deklaracja tablicy
  
        HashMap <Integer, Integer> mapka = new HashMap<>(); //deklaracja mapy ktora bedzie licznikiem
        
        for (int a=1; a<=10; a++) //pętla nadaje klucze mapie, czyli liczby z przedzialu 1-10 ktore mozna wylosowac
        {
            mapka.put(a,0);
        }
        
        
        for (int i=0; i<liczby.length; i++){            //pętla wypełnia tablicę losowymi liczbami
            
            int wylosowana = new Random().nextInt(10)+1;
            liczby[i] = wylosowana;
            
            
            if (mapka.containsKey(wylosowana)){     //jeżeli klucz mapy zawiera wylosowaną liczbę, to wartość przy tym kluczu jest zwiększana o 1
                mapka.put(wylosowana, mapka.get(wylosowana)+1);
            
            }   

        }
        
        System.out.println("Wylosowane liczby to: ");       //pętla wypisuje wylosowane liczby
        for (int tmp: liczby)
        {
            System.out.print(tmp + ", ");
        }
               
        
        System.out.println("");
        
        for (int tmp2: mapka.keySet()){         //pętla wypisuje ile razy dana liczba występuje
           System.out.print("Liczba "+tmp2+ " występuje: ");
           System.out.println(mapka.get(tmp2)+ " razy");
       }
        
        
      
        
        
        
        
}
    
}
