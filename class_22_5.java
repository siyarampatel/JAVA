
import java.util.*;
class class_22_5{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0; i<20; i++){
            list.add(i);
        }
        List<Integer>greaterThanFive=list.stream().filter(n->n>5).toList();
        List<Integer> oddNumber = greaterThanFive.stream().filter(n->n%2!=0).toList();
        int oddSum= oddNumber.stream().reduce(0,(a,b)->a+b);
        System.out.println("ODD SUM->"+oddSum);
    }   
}