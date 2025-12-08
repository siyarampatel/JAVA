//chech if there are duplicates element or not
import java.util.*;
class class_17_2{
    public static void main(String [] args){
        HashSet<Integer>set=new HashSet<>();
        int arr[]={1,2,3,2,1};
        for(int v:arr){
            set.add(v);
        }
        int count = 0;

        for(int x:set){
            count++;
        }

        if(count<arr.length)
        System.out.println("Duplicate element is present");
        else
        System.out.println("Duplicate element is not present");
    }
}