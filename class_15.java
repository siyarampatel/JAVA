//Hash Map
/*An hashmap contains an key and value the respective key will point to it's respective value
the combination of key and value can be of different data type*/

import java.util.HashMap;

class class_15{
    public static void main(String [] args){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,10);
        map.put(2,20);
        map.put(3,30);
        System.out.println(map);

        System.out.println(map.get(1)); //for getting an value from an particular key
        System.out.println(map.get(6));
        System.out.println(map.getOrDefault(5,8));//if the key we are passing does not exists so we can set an default value to print

        for(int x: map.keySet()){
            System.out.println(map.get(x));  //for receiving output without formating (only values)
        }

    }
}
