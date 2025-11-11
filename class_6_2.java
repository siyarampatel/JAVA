// //class will not occupy space until its object is created
// class car{
//     String name;

//     void display(){
//         System.out.println("Hello");
//     }
// }

// class class_6_2{
//     public static void main(String[]args){
//         car obj = new car();
//         obj.display();
//     }
// }

class student{
    String name;
    int roll;
    int marks;
    
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
    }

}

class class_6_2{
    public static void main(String [] args){
        student obj = new student();
        obj.name = "ram";
        obj.roll = 212;
        obj.marks = 0;
        obj.display();
    }
}