//frequency of an integers in an array via hash map
import java.util.HashMap;
class class_15_2{
    public static void main(String [] args){
        HashMap<Integer,Integer>map=new HashMap<>();
        int []arr={2,3,3,4,2,4,5,5,3,4,3};
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        System.out.println(map);
    }
}