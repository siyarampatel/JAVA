import java.util.*;
class class_18_4{
    public static void main(String [] args){
        ArrayList<Integer> list= new ArrayList<>();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        for(int x : arr){
            list.add(x);
        }
        ListIterator<Integer>it=list.listIterator();
        while(it.hasNext()!=list.size()/2){
            int x = it.next();
            System.out.println(x);
        }
    }
}