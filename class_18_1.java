/*In list iterator we can move both ways backward and forward*/
import java.util.*;
class class_18_1{
    public static void main (String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ListIterator<Integer>it=list.listIterator();
        Integer x=it.next();
        System.out.println(x);
    
    while(it.hasPrevious()){
        Integer y = it.previous();
        System.out.println(y);
    }
}
}