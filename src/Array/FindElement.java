package Array;
import java.util.Scanner;
public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int s=-1;
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==f){
                s=i;
                break;
            }
        }
        System.out.println(s);
    }
}
