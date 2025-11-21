interface animal{
   void makeSound();
}

class dog implements animal{
   public void makeSound(){
        System.out.println("BARK");
    }
}

class class_11_2{
    public static void main(String [] args){
        animal a = new dog();
        a.makeSound();
    }
}