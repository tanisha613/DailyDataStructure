package String;

import java.util.*;
public class ShortestPath {
    public static  float shortestDisplace(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            if(path.charAt(i)=='S'){
                y--;
            }
            if(path.charAt(i)=='W'){
                x--;
            }
            if(path.charAt(i)=='E'){
                x++;
            }
        }

            return  (float)Math.sqrt((Math.pow(x-0,2)+(Math.pow(y-0,2))));


    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(shortestDisplace(path));

    }
}
