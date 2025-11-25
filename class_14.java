 /*“Collection Framework in Java provides ready-made classes and interfaces to implement common data structures like List,
  Set, Map, Stack, Queue, etc., along with many built-in (predefined) methods to work with them.”*/

//   create
//   read
//   update 
//   delete

/*Array List*/

import java.util.ArrayList;
class class_14{
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();/*You cannot write int in ArrayList<int> because 
                                                   ArrayList works only with objects, not with basic (primitive) types.*/
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.add(1,4);
        System.out.println(list);
                                                     /*get function will give an value but print functioin should be used ,set will update
                                                     the value on that index*/
        
        list.set(0,7);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        list.remove(Integer.valueOf(6));
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        boolean isEmpty = list.isEmpty();
        System.out.println(isEmpty);



        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        for(int num: list){
             System.out.println(num);
        }
    }
}