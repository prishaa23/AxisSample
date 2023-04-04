package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StudentArray {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(2, "Prasanthi"));
        students.add(new Student(1, "Nisha"));
        students.add(new Student(3, "Jeshy"));

        // Sort by ID using Comparator(new comparator<student>() is an anonymous class)
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.id, s2.id);
            }
        });

        System.out.println("Sorted by ID:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by name using Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Sorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
