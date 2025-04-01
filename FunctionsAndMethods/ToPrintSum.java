package FunctionsAndMethods;
import java.util.Scanner;

public class ToPrintSum {
    // FIRST WAY
//    public static void printSum() {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int sum= a+b;
//
//        System.out.println(sum);
//        return ;
//
//    }
//
//
//    public static void main(String[] args) {
//
//        printSum();
    // SECOND WAY
//    public static void printSum(int num1,int num2) {
//        int sum=num1+num2;
//        System.out.println(sum);
//        return;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        printSum(a,b);
//
//    }
    // third way
    public static int printSum(int num1,int num2) {//formal parameters
        int sum=num1+num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add= printSum(a,b);//arguments or actual parameter
        System.out.println(add);

}}