// class shape{
//     void draw(){
//         System.out.println("DRAWING");
//     }
// }

// class circle extends shape{
 
//     void calculateArea(int r){
//         System.out.println("THE AREA OF CIRCLE: "+3.14*(r*r));
//     }
// }
// class class9_1{
//     public static void main(String [] args){
//         circle c = new circle();
//         c.draw();
//         c.calculateArea(5);
//     }
// }

class shape{
    void draw(){
        System.out.println("DRAWING");
    }
}

class circle extends shape{
    int r;
    void calculateArea(){
        System.out.println("THE AREA OF CIRCLE: "+3.14*(r*r));
    }
}
class class9_1{
    public static void main(String [] args){
        circle c = new circle();
        c.draw();
        c.r=5;
        c.calculateArea();
    }
}
