package AdvancedPattern;
import java.util.Scanner;

public class pattern2 {
    public static void triPattern(int r,int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        triPattern(r,c);
    }
}
