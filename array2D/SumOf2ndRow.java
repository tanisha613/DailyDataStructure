package array2D;

public class SumOf2ndRow {
    public static void sum(int [][]array){
        int add=0;
            for(int j=0;j<array[0].length;j++){

                    add+=array[1][j];

            }

        System.out.println(+add);
    }

    public static void main(String[] args) {
        int [][]nums={{1,4,9},
                {11,4,3},
                {2,2,3}};
        sum(nums);
    }
}
