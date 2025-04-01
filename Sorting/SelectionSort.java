package Sorting;
import java.util.*;

public class SelectionSort {
    public static void selectionSorting(int[]arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){//turns
        int minPosition=i;


            for(int j=i+1;j<n;j++){

                if(arr[minPosition]>arr[j]){
                    minPosition=j;

                }
            int temp=arr[minPosition];

            arr[minPosition]=arr[i];
            arr[i]=temp;
            }

        }}

        public static void printArr(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int []arr={5,4,1,3,2};
        selectionSorting(arr);
        printArr(arr);


    }
}
