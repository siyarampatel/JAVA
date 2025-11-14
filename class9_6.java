//METHOD OVERLOADING
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class dog extends Animal{
    void eat(){
        System.out.println("Grass");
    }
}
class class9_6{
    public static void main(String [] args){
        dog d = new dog();
        d.eat();

        Animal f = new dog();       //Taking refrence of parent and making object of child 
        f.eat();

        Animal a = new Animal();
        a.eat();
    }
}
