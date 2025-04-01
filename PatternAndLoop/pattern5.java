package PatternAndLoop;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        char ch='A';
        int r,c;
        for( r=1;r<=n;r++){
            for( c=r;c>=1;c--){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
