//ABSTRACT CLASS
//its object cannot be created (adhoori class)
//abstract keyword is used
//essential part is written outside the abstract class

abstract class animal{
    abstract void eat();
}

class dog extends animal{
    void eat(){
        System.out.println("Eating");
    }
}

class class_10_4{
    public static void main(String [] args){
        dog d = new dog();
        d.eat();
    }
}