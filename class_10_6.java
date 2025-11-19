abstract class shape{
    abstract void area(int a,int b);   //abstract class with abstract method area
}

class circle extends shape{
   void area(int a,int b){                  //inherited shape

        System.out.println("The area of circle is: "+3.14*a*a);
    }
}


class rectangle extends shape{
   void area(int a,int b){
        System.out.println("The area of rectangle is: "+a*b); 
    }
}

class class_10_6{
    public static void main(String [] args){
        shape s = new circle(); //Making objects 
        shape s1 = new rectangle();
        s.area(5,0);
        s1.area(5,6);
    }
}