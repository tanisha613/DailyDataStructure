package PatternAndLoop;
import java.util.*;
/*Write a program that reads a set of integers, and then prints the sum of the
even and odd integers.*/
public class SumOfEvenAndOddIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int i;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("enter the number");
            n=sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice=sc.nextInt();
        }while (choice==1);

            System.out.println("Sum Of Even Integers:"+evenSum);
            System.out.println("Sum of Odd Integers:"+oddSum);
    }
}
