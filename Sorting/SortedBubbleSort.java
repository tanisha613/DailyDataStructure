package Sorting;

public class SortedBubbleSort {
    public static void bubbleSort(int []array){
        int n=array.length;
        int temp=0;
        for(int turn=0;turn<n-1;turn++){
        int swap=0;
            for(int j=0;j<n-1-turn;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
                    swap++;
                if(swap==0){
                    printArr(array);

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
        int []array={1,2,3,4,5};
        bubbleSort(array);
        printArr(array);


    }
}
