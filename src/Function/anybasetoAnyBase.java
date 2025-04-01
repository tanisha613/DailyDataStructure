package Function;

import java.util.Scanner;

public class anybasetoAnyBase {
    static int BaseToDecimal(int b1, int n){
        int rv1=0;
        int p=1;
        while (n>0){
            int rem = n%10;
            rv1+=rem*p;
            p=p*b1;
            n/=10;
        }
        return rv1;
    }
    static int DecimalToBase(int b2,int n){
        int rv2=0;
        int p=1;
        while (n>0){
            int rem1 = n%b2;
            rv2+=rem1*p;
            p=p*10;
            n/=b2;
        }
        return rv2;

    }

    static int getvalue(int b1,int b2, int n){
        int an = BaseToDecimal(b1,n);
        int sol = DecimalToBase(b2,an);
        return sol;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b1=sc.nextInt();
        int b2 = sc.nextInt();
        int n=sc.nextInt();
        System.out.println(getvalue(b1,b2,n));
    }
}
