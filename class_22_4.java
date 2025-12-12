
import java.util.*;
class class_22_4{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);   
        int data= list.stream().reduce(0,(a,b)->a+b);  //reduce function operation in  all digits(output->single value)

        System.out.println(data);
        
    }
}