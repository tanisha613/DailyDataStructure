package AdvancedPattern;
import java.util.Scanner;
public class HollowRectangle {
    public static void hollowRect(int r, int c) {


        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            int r=sc.nextInt();
            int c=sc.nextInt();
            hollowRect(r,c);
        }

    }

        {

        }
    }
