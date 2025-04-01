package array2D;
import java.util.*;

public class TransposeOfAMatrix {
    public static void transpose(int [][]arr){
        int trans[][]=new int[3][2];
        for (int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                trans[i][j]=arr[j][i];

            }

    }
        printArr(trans);

    }
    public static void printArr(int [][]trans){
        for (int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]);
            }
            System.out.println();}
    }

    public static void main(String args[]) {
        int [][] arr={{1,2,3},
            {5,6,7}};
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
         transpose(arr);




}}


