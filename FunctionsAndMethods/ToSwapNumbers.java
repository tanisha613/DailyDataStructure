package FunctionsAndMethods;
import java.util.*;

public class ToSwapNumbers {
    public static void Swapping(int num1,int num2){
        int temp=0;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        Swapping(a,b);
    }
}
