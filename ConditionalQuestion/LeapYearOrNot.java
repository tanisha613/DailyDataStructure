package ConditionalQuestion;
import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of year");
        int year =sc.nextInt();
        if(year%4!=0){
            System.out.println("Not leap year");
        }
        else if(year%4==0&&year %100!=0){
            System.out.println(" leap year");
        } else if (year%4==0&&year %100==0&&year %400!=0) {
            System.out.println("Not leap year");
        }
        else {
            System.out.println("Leap year");
        }
    }
}
