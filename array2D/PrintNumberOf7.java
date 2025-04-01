package array2D;

public class PrintNumberOf7 {
    public static void printFrequencyOf7(int [][]array){
               int count=0;
       for (int i=0;i<array.length;i++){
           for(int j=0;j<array[0].length;j++){
               if(array[i][j]==7){
                   count++;
               }
           }
       }
        System.out.println("The frequency of 7 is :"+count);

    }


    public static void main(String[] args) {
        int [][] array={{4,7,8},
            {8,8,7}};
        printFrequencyOf7(array);

}}
