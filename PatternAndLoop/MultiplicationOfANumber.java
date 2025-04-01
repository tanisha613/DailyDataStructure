package PatternAndLoop;

import java.util.Scanner;

public class MultiplicationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int Table=1;
        for(int i=1;i<=10;i++){
            Table=n*i;
            System.out.println(Table);

        }
    }
}