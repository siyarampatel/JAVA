//replace elements by their absolute value 
import java.util.*;
class class_18_5{
    public static void main (String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(-4);
        ListIterator<Integer>it=list.listIterator();
        
    while(it.hasNext()){
        Integer x = it.next();
        if(x<0){
            it.set(-(x));
        }
    }
    it = list.listIterator();
    while(it.hasNext()){
        Integer z = it.next();
        System.out.println(z);
    }
}
}