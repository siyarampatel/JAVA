//comparable code 
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int roll;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }


    public int compareTo(Student s) {
        return this.roll - s.roll;
    }

    public String toString() {
        return "[Roll=" + roll + ", Name=" + name + "]";
    }
}

class class_16 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(160, "Raman"));
        list.add(new Student(156, "Rishabh"));
        list.add(new Student(170, "Mohan"));

        Collections.sort(list);
        System.out.println(list);
    }
}
