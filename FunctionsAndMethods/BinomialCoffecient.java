package FunctionsAndMethods;

public class BinomialCoffecient {
    public static int factorial(int n){

        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;

    }
    public static void Bino(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nr=factorial(n-r);

//        for(int i=n;i>=1;i--){
//            fact_n=fact_n*i;
//        }
//        for(int j=r;j>=1;j--){
//            fact_r=fact_r*j;
//        }
//
//        for (int k=n-r; k>=1;k--){
//            fact_nr=fact_nr*k;
//        }
        int binoCoffecient=fact_n/(fact_r*fact_nr);
        System.out.println("Binomial coffecient is :"+binoCoffecient);
        return;
    }
    public static void main(String[] args) {

       Bino(5,2);

    }
}
