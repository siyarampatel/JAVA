//start from middle and go till end and print all the element
import java.util.*;
class class_19_1{
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for(int x : arr){
            list.add(x);
        }
        ListIterator<Integer>it=list.listIterator();
       int m=list.size()/2;
        while(it.nextIndex()<m){
            it.next();
        }
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
        
    }
  }
