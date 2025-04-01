package Array;
import java.util.*;

public class TrappingWater {
    // generate a function and passing formal parameter
    public static int trappingWater(int [] height) {
        int n = height.length;
        // generating auxillary array
        int[] leftMaxBoundary = new int[n];
        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxBoundary[i] = Math.max(height[i], leftMaxBoundary[i-1]);
        }
        int[] rightMaxBoundary = new int[n];
        rightMaxBoundary[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }
        int trappedWater=0;
        //loop
        for (int i=0;i<n;i++){
           int waterLevel=Math.min(leftMaxBoundary[i],rightMaxBoundary[i] ) ;
           trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
// Main function
    public static void main(String[] args) {
        int [] height={4,2,0,6,3,2,5};


        // calling function and passing values through actual parameter
        System.out.println(trappingWater(height));


    }

}
