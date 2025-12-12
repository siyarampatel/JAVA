import java.util.*;
class class_22_6{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0; i<20; i++){
            list.add(i);
        }
        List<Integer>skip=list.stream().skip(2).toList();//it will skip the elements of given size
        List<Integer>limit=list.stream().limit(2).toList();//it will give only the given size of elements
        List<Integer>sort=list.stream().sorted((a,b)->a-b).toList();//accending order
        System.out.println(skip);
        System.out.println(limit);
        System.out.println(sort);

    }   
}