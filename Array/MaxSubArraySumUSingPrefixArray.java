package Array;
import java.util.*;

public class MaxSubArraySumUSingPrefixArray {
    public static void arraySum(int[] numbers){
        int x=Integer.MAX_VALUE;
        int y=Integer.MIN_VALUE;
        int sum=0;
        int [ ]prefix= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(y<sum){
                    y=sum;
                }
            }
        }

        System.out.println("MAX sum is:"+y);
    }
    public static void main(String[] args) {
        int []numbers={1,-2,6,-1,3};
        arraySum(numbers);

    }
}
