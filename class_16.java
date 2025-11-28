import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
    String name;
    int Rollno;
    public Student(int Rollno,String name){
        this.name=name;
        this.Rollno=Rollno;
    }
    public int compareTo(Student s1){
        return this.Rollno-s1.Rollno;
    }
}
class class_16 {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student{Rollno:160,name:"Rsman"});
        list.add(new Student{Rollno:156,name:"Rishabh"});
        Collections.sort(list);
        System.out.println(list.Tostring);
    }
}

// class student implements Comparable<student> {
//     String name;
//     int roll;
//     int marks;
//   public  student(String name, int roll, int marks) {
//         this.name = name;
//         this.roll = roll;
//         this.marks = marks;
//     }
//     public int compareTo(student o) {
//         return this.marks - o.marks;
//     }
//     public String toString() {
//         return "student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
//     }
//     class hello {
//         public static void main(String[] args) {
//             ArrayList<student> list = new ArrayList<>();
//             list.add(new student("ram", 1, 90));
//             list.add(new student("shyam", 2, 80));
//             list.add(new student("mohan", 3, 70));
//             System.out.println(list);
//             Collections.sort(list);
//             System.out.println(list);
//         }
//     }