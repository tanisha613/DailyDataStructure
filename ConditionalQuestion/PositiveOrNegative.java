package ConditionalQuestion;
import java.util.*;
// program to find weather the number is positive or negative
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        if(n>=0){//using if-else statement
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}//end of code
