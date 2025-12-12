/*Stream API -> stream converts data into flow of data after that we can apply different functions then again after conversion we can 
print it*/
import java.util.*;
class class_22_2{
    public static void main(String [] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);   /*we can only use these predefined functions in stream only*/
        List<Integer> result = list.stream().filter(n->n>60).toList(); //used filter by converting list to stream then converted it to list a
                                                                       // and printed it
        System.out.println(result);
        
    }
}//filter takes stream and gives stream in output 