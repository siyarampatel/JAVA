//who's pair has sum equal to our given number
import java.util.HashMap;
class class_15_4{ 
    public static void main(String [] args){
        int arr[]={2,7,5,4};
        HashMap<Integer,Integer>map=new HashMap<>();
        int target=9;
        for(int i=0; i<arr.length; i++){
            int diff = target-arr[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff));
                break;
            }
            map.put(arr[i],i);
        }
        
    }
}