package FunctionsAndMethods;

public class FunctionOverloadingUsingDataTypes {
    //func to calculate int sum
    public static int sum(int a,int b){
        return a+b;
    }
    //func to calculate float sum
    public static float sum(float a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,7));
        System.out.println(sum(1.4f,1.6f));
    }
}
