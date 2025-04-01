package Array;
import java.util.*;


public class SubArray {
    public static void subArr(int []numbers){
    int x=Integer.MIN_VALUE;
    int y=Integer.MAX_VALUE;
        int ts=0;
        int sum=0;
        int end=numbers.length;
        for(int i=0;i<end;i++){
            for(int j=i;j<end;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                    System.out.print("\n"+"sum of subarray is :"+sum);
                if(x<sum){
                    x=sum;
                }
                if(y>sum){
                    y=sum;
                }
                sum=0;
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays:"+ts);
        System.out.println("Min_Sum is :"+y);
        System.out.println("Max_Sum is :"+x);


    }
    public static void main(String[] args) {
        int[] numbers ={2,4,6,8,10};
        subArr(numbers);

    }
}
