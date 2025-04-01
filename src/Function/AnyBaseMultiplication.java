package Function;
import java.util.Scanner;
public class AnyBaseMultiplication {
    Scanner sc = new Scanner(System.in);

    static  int BaseMultiplication(int b, int n1,int n2){
           int rv =0;
           int p=1;
           while (n2>0){
               int d2 = n2%10;
               n2=n2/10;
               int sprd = getProductWithASingleDigit(b,n1,d2);
               rv=addBase(b, rv,sprd*p);
               p=p*10;
           }
           return rv;
    }
    static int addBase( int b,int n1, int n2){
        int sum=0;
        int p=1;
        int carry=0;
        while (n1>0||n2>0||carry>0){
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1/=10;
            n2/=10;
            int sd = (rem1+rem2+carry);
            int s = sd%b;
            carry=sd/b;
            sum+=s*p;
            p=p*10;
        }
        return sum;
    }

    static  int getProductWithASingleDigit(int b, int n1, int d2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0 || c>0){
            int d1 = n1%10;
            n1/=10;
            int d = d1*d2+c;
            c=d/b;
            d=d%b;
            rv=rv+d*p;
            p=p*10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int ans = BaseMultiplication(b,n1,n2);
        System.out.println(ans);
    }
}
