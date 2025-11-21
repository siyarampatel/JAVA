interface vehicle{
   default void start(){
    System.out.println("Vehicle is starting");
   }
}
class car implements vehicle{
   
}

class class_12_3{
    public static void main(String [] args){
        car c = new car();
        c.start();
    }
}