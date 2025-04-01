import java.util.*;
public class factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int i=2;
//        while(n>0){
//            int rem=n%i;
//            if(rem!=0){
//                i++;
//            }else{
//                System.out.print(i+" ");
//                n/=i;
//            }


        for(int div =2; div*div<=n;div++){
            while(n%div==0){
                n/=div;
                System.out.print(div+" ");
            }

        }
        if(n!=1){
            System.out.print(n);
        }
    }
}
