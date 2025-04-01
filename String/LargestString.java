package String;
// we are finding the largest string in lexicographic order
// this question can be solved with the help of .comapreTo function
// str1.compareto(str2)=0 the equal
// <0 then -ve str1<str2
// >0 then +ve str1>str2

public class LargestString {
    public static void main(String[] args) {
        String str[]={"apple","mango","banana"};
        String largest = str[0];
        for(int i=0;i< str.length;i++){
            if(largest.compareTo(str[i])<0){
                largest=str[i];
            }
        }
        System.out.println(largest);

    }
}
