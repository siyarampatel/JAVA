class rectangle{
    int length;
    int bredth;
    int area(){
       return length*bredth;
    }
    int perimeter(){
       return 2*length+2*bredth;
    }

}

class class_6_3{
    public static void main(String [] args){
        rectangle obj = new rectangle();
        obj.length=4;
        obj.bredth=5;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}