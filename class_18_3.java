import java.util.*;
class class_18_3{
    public static void main (String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer>it=list.listIterator();
        
    while(it.hasNext()){
        Integer x = it.next();
        if(x%2!=0){
            it.set(-1); //we can manipulate data in list iterator but cannot in iterator(only we can remove)
        }
    }
    it = list.listIterator();
    while(it.hasNext()){
        Integer z = it.next();
        System.out.println(z);
    }
}
}