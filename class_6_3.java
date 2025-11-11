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
        System.out.println(obj.area(5,4));
    }
}