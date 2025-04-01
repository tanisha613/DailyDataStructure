package String;
import java.util.*;

public class CompareStringAndChar {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        char arr[]={'s','d','t','e'};
//        String str="abcd";
//        String str2 =new String("xyz");
// above two methods are the only method to declare a string
        //Strings are Immutable in java
//        System.out.println(arr);
//        System.out.println(str);
//        System.out.println(str2);
//        Scanner sc = new Scanner(System.in);
//        String name;
//        name=sc.next();
//        System.out.println(name);
//       String full ="Tony Stark";
//        System.out.println(full.length());



        // CONCATENATION IN JAVA
        String firstName ="Tanisha";
        String lastName ="Gupta";
        String fullName = firstName+ " "+lastName;
        System.out.println(fullName);
        // to find the char at the specific position
//

        printLetters(fullName);
    }
}
