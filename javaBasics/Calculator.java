package javaBasics;
import java.util.Scanner;
// known as user driven code
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println("Enter operator : ");

        char operator =sc.next().charAt(0);//to input single character
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("operator not found");
        }
    }

    }

