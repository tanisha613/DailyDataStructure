package Array;
// in binary search we work for sorted array but if we dont know weather
// the array is sorted in ascending and descending order
// in that case how to find out binary search
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int []numbers={99,88,77,66,57};
        int key=57;
        int end=numbers.length-1;
        System.out.println("the index of key is :"+orderAgnosticBS(numbers,key));
    }


    static int orderAgnosticBS(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        // find weather the array is sorted in ascending or  descending
        boolean isAsc=arr[start]<arr[end];
//         if(arr[start]<arr[end]){
//            isAsc=true;
//        }else{
//            isAsc=false;
//        }
        while(start<=end){
//                int mid=(start+end)/2;// this is not the correct approch to solve this problem as it may happen that start +end exceed the range of int
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
    }

