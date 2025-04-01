package FunctionsAndMethods;


import java.util.Scanner;

public class palindrome {
    public static void palin(int n){
        int originalNumber=n;
        int r;
        int palinReverse=0;
        while (n>0){
            r=n%10;
            palinReverse=palinReverse*10+r;
            n/=10;

        }
        if(originalNumber==palinReverse){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        palin(num);
    }


    }

