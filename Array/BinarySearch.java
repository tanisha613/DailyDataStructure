package Array;
import java.util.*;


    public class BinarySearch{
        public static int binary(int[] numbers, int key, int end){
            int start =0;
            while(start<=end){
//                int mid=(start+end)/2;// this is not the correct approch to solve this problem as it may happen that start +end exceed the range of int
                int mid=start+(end-start)/2;
                if(numbers[mid]==key){
                    return mid;
                }
                if(numbers[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;
        }
        public static void main (String args[]){
            int []numbers={1,3,57,65,78,94,99};
            int key=57;
            int end=numbers.length-1;
            System.out.println("the index of key is :"+binary(numbers,key,end));
        }
    }
