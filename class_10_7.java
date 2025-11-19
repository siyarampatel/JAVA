abstract class animal{
    abstract void sound();
}

class dog extends animal{
    void sound(){
        System.out.println("woof woof");
    }
}

class cat extends animal{
    void sound(){
        System.out.println("meow meow");
    }
}

class class_10_7{
    public static void main(String [] args){
        dog d = new dog();
        cat c = new cat();
        c.sound();
        d.sound();
    }
}