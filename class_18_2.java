/*In list iterator we can move both ways backward and forward*/
import java.util.*;
class class_18_2{
    public static void main (String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ListIterator<Integer>it=list.listIterator();
        
    while(it.hasNext()){
        Integer x = it.next();
        if(x==7){
            it.set(10); //we can manipulate data in list iterator but cannot in iterator(only we can remove)
        }
    }
}
}