interface shape{
    double area(double n);
}

class circle implements shape{
    public double  area(double n){
        return 3.14*n*n;
    }
}

class class_11_3{
    public static void main(String [] args){
    circle c = new circle();
    System.out.println(c.area(5));
    }
}