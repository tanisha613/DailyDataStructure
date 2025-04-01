package array2D;

import java.util.*;

public class Creation2DArray {
    // to search an element of the matrix
    public static boolean search(int matrix[][],int key){
        int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }

            }
        }
            System.out.println("key not found");
            return false;
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
        search(matrix,5);


    }


}

