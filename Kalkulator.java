package J25_2;

public class Kalkulator {

    public int suma(int a, int b){
       return a+b;
    }

    public int suma(int a, int b, int c){
        return a + b + c;
    }

    public int roznica(int a, int b){
        return a-b;
    }

    public int roznica(int a, int b, int c){
        return a - b - c;
    }

    public int iloczyn(int a, int b){
        return a*b;
    }

    public int iloczyn(int a, int b, int c){
        return a * b * c;
    }

    public double iloraz(int a, int b){

        if (b == 0){
            System.out.println("nie można dzielić przez zero");
            return 0;
        }

        else return a/b;
    }

    public double iloraz(int a, int b, int c){

        if (b == 0 || c == 0) {
            System.out.println("nie można dzielić przez zero");
            return 0;
        }
        else return a / b / c;
    }




}
