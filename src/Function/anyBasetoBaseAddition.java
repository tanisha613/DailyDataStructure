package Function;
import java.util.*;
public class anyBasetoBaseAddition {
    static int AnyBaseToDecimal(int n,int b){
        int rv=0;
        int p=1;
        while(n>0){
            int rem = n%10;
            n/=10;
            rv+=rem*p;
            p=p*b;

        }
        return rv;

    }
    static int decimalToADD(int r1 , int r2,int b){
        int sum = r1+r2;
        int num=sum;
        int rv1=0;
        int p=1;
        while (num>0){
            int rem = num%b;
            num/=b;
            rv1+=rem*p;
            p=p*10;
        }
        return rv1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();
        int r1 = AnyBaseToDecimal(n1,b);
        int r2 = AnyBaseToDecimal(n2,b);
        int Add = decimalToADD(r1,r2,b);
        System.out.println(Add);
    }
}
