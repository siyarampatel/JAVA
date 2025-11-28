import java.util.*;

class class_17_1{
    public static void main(String [] args){
        HashSet<Integer>set=new HashSet<>();
        set.add(10);
        set.add(10);
        System.out.println(set); //Duplicate data can't be stored 

        set.add(20);
        set.add(30);
        System.out.println(set); //Sequence is not followed 

        
    }
}