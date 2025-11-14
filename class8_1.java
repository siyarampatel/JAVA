//the object of child class can accesess the materaial of both(feilds,methods)but parent class cannot
class human{
    String name;
    int phone;
    
    void show(){
        System.out.println("NAME: "+name);
        System.out.println("PHONE NUMBER: "+phone);
    }
}
    class student extends human{
        int roll;
        void show1(){
        System.out.println("ROLL: "+roll);
        }
    }


class class8_1{
    public static void main(String[]args){
        student s = new student();
        s.name="Siyaram";
        s.phone=911;
        s.roll=21;
        s.show();
        s.show1();
    }
}