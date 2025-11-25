import java.util.LinkedList;
class class_14_1{
    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.set(0,4);
        System.out.println(list);

        list.remove(Integer.valueOf(2));
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        list.addFirst(10);
        list.addLast(20);
        
        System.out.println(list);

    }
}