
/*Overload a method calculateArea for calculating the area of a circle (use radius as the argument), 
rectangle (use length and width), and triangle (use base and height).*/

class areaFinder{
    void area(int a){
        System.out.println("THE AREA OF CIRCLE IS: "+3.14*(a*a));
    }
    void area(int a,int b){
        System.out.println("THE AREA OF RECTANGLE IS: "+a*b);
    }
    void area(int a,long b){
        System.out.println("THE AREA OF TRIANGLE IS: "+1/2*a*b);
    }

}

class class9_7{
    public static void main(String [] args){
        areaFinder z = new areaFinder();
        z.area(6);
        z.area(6,8);
        z.area(6,9);
    }
}