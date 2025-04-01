package FunctionsAndMethods;
import java.util.Scanner;

public class FactorialOfNumber {
//    public static void factorial(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//         int n=sc.nextInt();
//        int fact=1;
//        for(int i=n;i>=1;i--){
//            fact=fact*i;
//        }
//        System.out.println(fact);
//
//    }
//    public static void main(String[] args) {
//        factorial();
//
//    }
    //SECOND WAY
    public static int factorial(int n){

        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;

    }

    public static void main(String[] args) {

        int fact=factorial(4);
        System.out.println(fact);


    }
}
