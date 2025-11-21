interface A{
    void display();
}
interface B{
    void display();
}

class demo implements A,B{
    public void display(){
        System.out.println("Displaying");
    }
    
//    public void display(){
//         System.out.println("Displaying1");
//     }
}

class class_11_1{
    public static void main(String [] args){
        demo d = new demo();
        d.display();
    }
}