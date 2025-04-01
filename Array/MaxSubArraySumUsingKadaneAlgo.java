package Array;
import java.util.*;

public class MaxSubArraySumUsingKadaneAlgo {
    public static void subArraySum(int[] numbers) {
        int Max_S = Integer.MIN_VALUE;
        int Min_S = Integer.MAX_VALUE;
        int currentSum = 0;
        int max=0;
            for (int i = 0; i < numbers.length; i++) {

                    if (numbers[i] < 0) {
                        max = Math.max(Max_S, numbers[i]);}

                    currentSum = currentSum + numbers[i];

                    if (currentSum < 0) {
                        currentSum = 0;
                    }
                    Max_S = Math.max(Max_S, currentSum);
            if(Max_S==0){
                Max_S=max;
            }
                }
        System.out.println(+Max_S);
                }

        public static void main (String[]args){
            int[] numbers = {-1, -2, -3, -4};
            subArraySum(numbers);
        }



    }
