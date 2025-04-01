package FunctionsAndMethods;
import java.util.*;

public class DecimalToBinary {
    public static void decToBin(int n){
        int originalValue=n;
        int pow=0;
        int binary=0;
        while(n>0){
            int rem=n%2;
            binary+=(rem*(int)Math.pow(10,pow));
             pow++;
            n/=2;

        }
        System.out.println("binary of "+originalValue+" is "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        decToBin(n);

    }
}
