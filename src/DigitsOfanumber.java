
//Question Statement:
      //  1. You've to display the digits of a number.
      //  2. Take as input "n", the number for which digits have to be displayed.
      //  3. Print the digits of the number line-wise.


import java.util.Scanner;
public class DigitsOfanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=n;
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        int div = (int)Math.pow(10,count-1);
        while(div>0){
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div/=10;
        }

    }
}