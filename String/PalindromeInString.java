package String;

public class PalindromeInString {
    public static boolean palindrome(String str){
        int n=str.length();
        for (int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str="racecar";

        System.out.println(palindrome(str));
    }

}
