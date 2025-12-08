/*Iterator is used when you want to safely remove elements from a collection while looping. */
import java.util.*;
class class_18{
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x);
            if(x==0){
                it.remove();
            }
        }

    }
}