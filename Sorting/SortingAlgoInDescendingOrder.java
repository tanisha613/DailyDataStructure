package Sorting;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.*;
// bubble  sort
public class SortingAlgoInDescendingOrder {
    public static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){

                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    // selection sort
    public  static  void selectionSort(int [ ] arr){
        for(int i=0;i<arr.length-1;i++){
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxPos]<arr[j]){
                    maxPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxPos];
            arr[maxPos]=temp;
        }
    }
    // insertion sort
    public static void insertionSort(int [] array){
        for(int i=1;i< array.length-1;i++){
            int curr=array[i];
            int prev=i-1;
            while(prev>=0&&curr>array[prev]){
               array[prev+1]=array[prev];
               prev--;
            }

        array[prev+1]=curr;


        }

    }
    // countingSort
    public static void countingSort(int [] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           largest=Math.max(largest,arr[i]);
        }
        int [] count =new  int [largest+1];
       for(int i=0;i<arr.length;i++){
           count[arr[i]]++;
       }
       int j=0;
      for(int i=count.length-1;i>=0;i--){
         while (count[i]>0){
             arr[j]=i;
             j++;
             count[i]--;
         }
      }

    }
    public static void main(String[] args) {
        int[] arr ={6,3,8,7,4,5,3,2,1,1};
     countingSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
