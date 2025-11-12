//Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
//  perimeter. Create objects with different values and call those methods
class rectangle{
    // int length;
    // int bredth;

    rectangle(int length, int breadth){
        System.out.println("Area: "+length*breadth);
        System.out.println("Perimeter "+2*(length+breadth));
    }

}

class class_7_4{
    public static void main(String [] args){
        rectangle obj = new rectangle(4,5);

    }
}