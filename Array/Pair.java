package Array;

public class Pair {
    public static void pairInArray(int numbers[]){
        int n=numbers.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }

    }
    public static void main (String args[]){
        int []numbers={3,5,7,8,23,6,86};
        pairInArray(numbers);
    }
}
