package array2D;
import java.util.*;
public class SpiralMatrix {
    public static  void spiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow&&startCol<=endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //for bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }

                System.out.print(matrix[endRow][j]+" ");
            }
            // for left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
//        int matrix[][]=new int[4][4];
//        int n=matrix.length;
//        int m=matrix[0].length;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                matrix[i][j]=sc.nextInt();
//
//            }
//    }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        spiral(matrix);



    }
}
