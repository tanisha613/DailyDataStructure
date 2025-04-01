package FunctionsAndMethods;
import java.util.*;

public class PrimeORNot {
    // for n>=2
//    public static boolean isPrime(int n){
//        // corner or special cases
//        if(n==2){
//            return true;
//        }
//
//
//        for(int i=2;i<=n-1;i++){
//            if(n%i==0){
//                return false;
//            }
//
//        }
//            return  true;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//        System.out.println(isPrime(n));
//    }
    // optimized approched
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
             return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(isPrime(n));
    }
}
