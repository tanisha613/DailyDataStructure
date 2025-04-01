package Array;
public class PassByReference {
    public static void update(int[] marks, int nonChangeable){// this will take array as arguments;
        nonChangeable =10;
        for(int i=0;i<marks.length;i++){// i is the index of array
            marks[i]=marks[i]+1;

        }

    }
    public static void main(String[] args){
        int nonChangeable =5;
        int[] marks ={97,98,99};
        update(marks,nonChangeable);
        System.out.println(nonChangeable);
        // print our marks
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }


}
