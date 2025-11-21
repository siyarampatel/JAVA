//Interface
interface walkable {
    void walk();
}

interface runnable{
    void run();
}

class human implements walkable,runnable{
   public void walk(){
        System.out.println("Walking");
    }
   public void run(){
        System.out.println("Running");
    }
}

class class_11 {
    public static void main(String [] args){
        human h = new human();
        h.walk();
        h.run();
    }
}