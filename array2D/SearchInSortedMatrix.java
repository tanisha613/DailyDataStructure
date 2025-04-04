package array2D;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static  int[] search(int[][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while (r<matrix.length&&c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            if(matrix[r][c]>target){
                c--;
            }

        }
            return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int [][]matrix={{10,20,30,40},
                {11,25,35,45},
                {28,29,37,49},
                {33,34,38,50}};
        int target=49;
        System.out.println(Arrays.toString(search(matrix, target)));


    }

    }

