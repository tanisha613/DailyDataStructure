package PatternAndLoop;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int i=0;
        while(n>0){
           i=i*10+n%10;
           n/=10;

        }
        System.out.println(i);

    }
}