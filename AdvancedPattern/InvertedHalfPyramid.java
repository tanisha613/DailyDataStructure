package AdvancedPattern;
public class InvertedHalfPyramid {
    public static void ivertedPyramid(int r){
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ivertedPyramid(5);

    }
}
