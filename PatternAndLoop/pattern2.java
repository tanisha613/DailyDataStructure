package PatternAndLoop;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int r,c;
        for( r=1;r<=n;r++){
            for( c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }


}}
