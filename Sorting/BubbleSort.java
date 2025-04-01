package Sorting;

public class BubbleSort {
    public static void bubbleSort(int []array){
        int n=array.length;
        int temp=0;
        for(int turn=0;turn<n-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
    }
public static void printArr(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    System.out.println();
}
    public static void main(String[] args) {
        int []array={5,4,1,3,2};
        bubbleSort(array);
        printArr(array);


    }
}
