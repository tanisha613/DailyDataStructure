package Function;
import java.util.*;
public class AnyBaseToDecimal {
    static int decimalEquivalent(int b,int n){
        int rv=0;
        int p=1;
        while (n>0){
            int rem = n%10;
            rv+=rem*p;
            p=p*b;
            n/=10;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int solution = decimalEquivalent(b,n);
        System.out.println(solution);
    }
}
