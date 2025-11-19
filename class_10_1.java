class animal {
    void eat(){
        System.out.println("pizza");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("burger");
    }

}

class class_10_1{
    public static void main(String [] args){
        animal a = new dog();  //upper casting 
        a.eat();
    }
}