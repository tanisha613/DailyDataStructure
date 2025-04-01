package FunctionsAndMethods;
import java.util.*;
public class AllPrimeInRange {
    public static boolean isPrime(int p){
        if(p==2){
            return true;
        }
        for(int k=2;k<=Math.sqrt(p);k++){
            if(p%k==0){
                return false;
            }
        }
        return true;
    }
        public static  void range(int n){
            for(int i=2;i<=n;i++){
               if(isPrime(i)){// is prime act as a helper function
                   System.out.print(i+" ");
               }
            }
            System.out.println();
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n=sc.nextInt();
        range(n);
    }
}
