package FunctionsAndMethods;
import java.util.Scanner;

public class SumofDigits {
    public static void sum(int num){
        int r=0;
        while (num>0){
            int p=num%10;
            num/=10;
            r=r+p;


        }
        System.out.println(r);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       sum(n);

    }

}
