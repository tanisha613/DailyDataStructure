package Array;
import java.util.Scanner;
import java.util.Arrays;
public class DifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int []arr1 = new int[n1];
        for (int i = 0; i <n1 ; i++) {
            arr1[i]=sc.nextInt();
        }
        int n2 = sc.nextInt();
        int []arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i]= sc.nextInt();
        }
        int []dif= new int[n2];
        int i= n1-1;
        int j=n2-1;
        int k= dif.length-1;
        int c=0;
        while(k>=0){
            int d=0;
            int arr1val =i >=0? arr1[i]:0;
            if(arr2[j]+c<arr1val){
                d=arr2[j]+c+10-arr1val;
                c=-1;
            }
            else{
                d=arr2[j]+c-arr1val;
                c=0;
            }
            dif[k]=d;
            i--;
            j--;
            k--;

        }
       int idx =0;
        while (idx < dif.length) {
            if (dif[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < dif.length){
            System.out.println(dif[idx]);
            idx++;
        }}

    }

