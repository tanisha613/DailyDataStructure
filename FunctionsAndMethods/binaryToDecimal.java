package FunctionsAndMethods;
import java.util.*;

public class binaryToDecimal {
    public static void binarySum(int binNum){
        int origninalNumber=binNum;
        int pow=0;
        int dec=0;
        while (binNum>0){
            int lastDigit=binNum%10;
            dec+=lastDigit*((int)Math.pow(2,pow));
            pow++;
            binNum/=10;

        }
        System.out.println( +origninalNumber+"="+dec);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        binarySum(n);

    }
}
