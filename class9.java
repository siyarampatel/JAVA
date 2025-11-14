class human{
    void display(){
        System.out.println("Abhijeet");
    }
}

class student extends human{
    void displayClass(){
        System.out.println("W1");
    }
}

class monitor extends student{
    void disipline(){
        System.out.println("20%");
    }
}

class class9{
    public static void main(String [] args){
        monitor m = new monitor();
        m.display();
        m.displayClass();
        m.disipline();
    }
}