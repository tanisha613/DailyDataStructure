package AdvancedPattern;
import java.util.*;
public class FloydTriangle {
    public static void floyd(int r,int c){
        int k=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" " );
                k++;

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
        floyd(r,c);
    }

}
