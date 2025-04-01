package Function;
import java.util.Scanner;
public class AnyBaseToAddition2 {
    static int addBase(int n1, int n2, int b){
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
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b= sc.nextInt();
        int ans = addBase(n1,n2,b);
        System.out.println(ans);
    }
}
