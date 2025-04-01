package array2D;

public class DiagonalSum {
    public static void diagonalSum(int [][]matrix){
        int n=matrix.length;
        int totalSum=0;
//        int pdSum=0;//primary diagonal sum
//        int sdSum=0;//Secondary diagonal sum
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j){
//                    pdSum+=matrix[i][j];
//                }
//            }
//            for(int j=n-1;j>=0;j--){
//               if((i+j)==n-1){
//                   sdSum+=matrix[i][j];
//
//               }
//            }
//             totalSum=pdSum+sdSum;
        for(int i=0;i<n;i++){
            totalSum+=matrix[i][i];
            if(i!=n-1-i){
                totalSum+=matrix[i][n-1-i];
            }

        }
        System.out.println("Ths diagonal Sum is :"+totalSum);

    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},
                {4,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        diagonalSum(matrix);

    }
}
