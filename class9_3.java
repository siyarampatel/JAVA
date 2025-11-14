//HEIRARCHALL 
class human{
    void display(){
        System.out.println("WE ARE HUMANS");
    }
}

class poor extends human{
    void display1(){
        System.out.println("I AM BROKE");
    }
}

class rich extends human{
    void display2(){
        System.out.println("RICH!!!");
    }
}

class class9_3{
    public static void main(String [] args){
        poor p = new poor();
        p.display();
        p.display1();

        rich r = new rich();
        r.display();
        r.display2();
    }
}