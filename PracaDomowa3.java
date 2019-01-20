
import java.util.ArrayList;
import java.util.Scanner;


public class PracaDomowa3 {
    
    public static void main(String[] args) {
        
    ArrayList<Integer> lista = new ArrayList<>(); //deklaracja listy
  
    Scanner odczyt = new Scanner(System.in);  //
    
    System.out.println("Witaj w programie sortowanie liczb całkowitych");
    
    while(true){   //pętla do wprowadzania podanych liczb
        
           
            System.out.println("Podaj liczbę, 0 kończy wprowadzanie");
            int liczba = odczyt.nextInt();
            
            if (liczba !=0 ){   //liczba różna od zera jest dodawana do listy
            lista.add(liczba);
            }
            
            else //zero kończy wprowadzanie
                break;
          
    }
       
        odczyt.close();  //zamknięcie strumienia wejścia
        //System.out.println("Twoje liczby bez sortowania to: " +lista);
       
        
        
    for (int i = 0; i<lista.size(); i++){  //algorytm sortujący
            
        for (int j =i+1; j<lista.size(); j++){
               
            if (lista.get(i) > lista.get(j)){
            int temp = lista.get(i);
            lista.set(i, lista.get(j));
            lista.set(j, temp);
                   
            }
               
               
        }
                    
    }
        
    System.out.println("Twoje liczby w porządku rosnącym to: ");   //wypsanie posortowanej listy
    for (int i = 1; i<= lista.size(); i++){
    System.out.println(lista.get(i-1));
    }
            
      
    
    }
    
    
}

