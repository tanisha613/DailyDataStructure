package Function;
import java.util.Scanner;
public class DigitFrequency {
    public static int frequency(int x , int j){
        int df=0;
        while (x>0){
            int r = x%10;
            if(r==j){
                df++;
            }
            x/=10;
        }
        return df;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nf=sc.nextInt();
        int FrDigit = frequency(n,nf);
        System.out.println("frequency of "+nf+" in digit "+n+" is "+FrDigit);
    }
}
