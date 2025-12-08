//Find the intersection of two arrays
import java.util.*;
class class_17_3{
    public static void main(String [] args){
        HashSet<Integer>set = new HashSet<>();
        int arr1[]={1,2,3,4,5,5,4};
        int arr2[]={1,2,3,4,5,6,7,5,4};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int x: arr1){
            set1.add(x);
        }

        for(int y:arr2){
            if(!set1.contains(y)){
                set2.add(y);
            }
        }
        System.out.println("The unique elements");
        for(int z: set2){
            System.out.println(z);
        }
        System.out.println("The common elements");
        for(int j: set1){
            System.out.println(j);
        }
    }
}
