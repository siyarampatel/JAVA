// DOWN CASTING
class animal {
    void eat(){
        System.out.println("pizza");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("burger");
    }
    void sleep(){
        System.out.println("Sleep");
    }
}

class class_10_2{
    public static void main(String [] args){
        animal a = new dog();  
        // a.sleep();  i can't use this way becuse i am taking refrence of parent and making object (up casting)
        // as this method sleep is not overriding(also not present in both) i can't use this way but if i have used child class object it
        // will work 

        dog b = (dog)a; //down casting 
        b.sleep();
        
    }
}