package array2D;

import java.util.*;

public class LargestAndSmallestElement {

    public static void largestAndSmallest(int matrix[][]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                largest=Math.max(largest,matrix[i][j]);
                smallest=Math.min(smallest,matrix[i][j]);


            }}
        System.out.println("largest element is "+largest);
        System.out.println("smallest element is "+smallest);


    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];// creation of array
        int n = 3, m = 3;//or n=matrix.length m=matrix[0].length
        // matrix of size 9
        // input tha data in array
        Scanner sc = new Scanner(System.in);
        //  we will fill rowWise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        largestAndSmallest(matrix);
    }
}
