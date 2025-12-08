//go till given target element then start moving backward and remove elements that are samller than our target
import java.util.*;
class class_18_6{
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        int [] arr = {20,10,4,14,3,10};
        for(int x : arr){
            list.add(x);
        }
        ListIterator<Integer>it=list.listIterator();
        int target = 14;
        while(it.hasNext()){
        if(it.next()==target){      //iterator reached till our target
            break;              
        }
    }
    while(it.hasPrevious()){        //iterator moving backward
        if(it.previous()<target){
                it.remove();
        }
    }
    it=list.listIterator();
     while(it.hasNext()){
        Integer z = it.next();
        System.out.println(z);
    }
  }
}