//go till half element and print them and then go reverse while printing elements
import java.util.*;
class class_18_4{
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for(int x : arr){
            list.add(x);
        }
        ListIterator<Integer>it=list.listIterator();
       int m=list.size()/2;
        while(it.hasNext()&&it.nextIndex()<=m){
            int x = it.next();
            System.out.print(x);
        }
        System.out.println();
        while(it.hasPrevious()){
            Integer y = it.previous();
            System.out.print(y);
        }
    }
}