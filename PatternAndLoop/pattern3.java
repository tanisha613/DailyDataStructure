package PatternAndLoop;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int r,c;
        for( r=n;r>=1;r--){
            for( c=r;c>=1;c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}