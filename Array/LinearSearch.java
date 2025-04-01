package Array;

public class LinearSearch {
    public static int search(int [] number,int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] number ={ 10,15,20,30,45,65,86};
        int key = 100;
        int solution = search(number,key);

            if(solution==-1){
                System.out.println("we have  not found key");
            }
            else{
                System.out.println("found key");
            }
        }
    }


