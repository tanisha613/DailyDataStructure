package AdvancedPattern;

import java.util.Scanner;

public class ZeroOnePattern {
    public static void zeroOne(int r,int c){

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0&&j%2!=0||i%2!=0&&j%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }


            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        zeroOne(r,c);
    }
}
