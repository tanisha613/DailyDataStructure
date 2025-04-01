package FunctionsAndMethods;
import java.util.*;

public class toCheckEven {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isEven(n)){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }
}
