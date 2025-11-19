//Over riding revision
class human{
    void eats(){
        System.out.println("Human eats");
    }
}

class boy extends human{
    void eats(){
        System.out.println("Boy eats");
    }
    void super_usage(){
        super.eats();
    }
}

class class_10{
    public static void main(String [] args){
        boy b = new boy();
        b.super_usage(); 
                        /*If we have to call the parent method with help of child 
                        object then we have to make an method under child class and use super keyword with the the name of method 
                        then the method present in the parent class will be called
                        */
    }
}