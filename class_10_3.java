class animal {
   static void eat(){
        System.out.println("pizza");
    }

}

class dog extends animal{
   static void eat(){
        System.out.println("burger");
    }

}

class class_10_3{
    public static void main(String [] args){
        animal a = new animal();
        dog b = new dog();
        animal c = new dog();

        a.eat();
        b.eat();
        c.eat();

      //The concept of overriding will not work here as we have used static method (only in otherwise same - parent class refrence object) so by default the 
        // the parent class method will be called
    }
}