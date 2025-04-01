package AdvancedPattern;


public class ButterflyTriangle {
    public static void butterflyPattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= c - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = r; i >= 1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        for(int j=c-2*i;j>=1;j--){
            System.out.print(" ");
            }
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterflyPattern(4,8);
    }
}
