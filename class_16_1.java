//comparator code
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int roll;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "[Roll=" + roll + ", Name=" + name + "]";
    }
}

class class_16_1{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(160, "Raman"));
        list.add(new Student(156, "Rishabh"));
        list.add(new Student(170, "Mohan"));


        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.roll - s2.roll;
            }
        });
        System.out.println("Sort by roll: " + list);

        Collections.sort(list, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println("Sort by name: " + list);
    }
}
