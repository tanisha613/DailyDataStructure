package Function;
import java.util.*;
public class AnyBaseToSubtraction {
    static  int BaseSubtraction(int n2 , int n1, int b){
        int sub=0;
        int p=1;
        int carry=0;
        while(n2>0){
            int rem1 = n2%10;
            int rem2 = n1%10;
            n2/=10;
            n1/=10;
            int d=0;
            rem1=rem1+carry;
            if(rem1>=rem2){
                carry=0;
                d=rem1-rem2;
            }
            else{
                carry=-1;
               d=rem1+b-rem2;
            }
            sub+=d*p;
            p=p*10;
        }
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int n1 = sc.nextInt();
        int b = sc.nextInt();
        int ans = BaseSubtraction(n2,n1,b);
        System.out.println(ans);
    }
}
