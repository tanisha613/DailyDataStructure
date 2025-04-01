package String;

public class EachWordToUppercase {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        int  n=str.length();
      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);
      for(int i=1;i<n;i++){
          if(str.charAt(i)==' '&&i<n-1){
              sb.append(str.charAt(i));
              i++;
              sb.append(Character.toUpperCase(str.charAt(i)));
          }
          else{
              sb.append(str.charAt(i));
          }
      }
      return sb.toString();




    }
    public static void main(String[] args) {
        String str ="hi, i am tanisha";
        System.out.println(touppercase(str));

    }
}
