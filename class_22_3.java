
import java.util.*;
class class_22_3{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);   
        List<Integer> result = list.stream().map(n->n+2).toList();  //using map stream to add 
                                                                    //2 in every element there can be other operations aslo
        System.out.println(result);                                  //output->stream
        
    }
}