package criticalThinking6;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    int rollno;
    String name;
    String address;

    Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return rollno + " | " + name + " | " + address;
    }
}

// Comparator to sort by Name
class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}

// Comparator to sort by Roll Number
class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.rollno, b.rollno);
    }
}

public class SortingArrayList {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students in random order
        students.add(new Student(5, "Mickey", "Madison, WI"));
        students.add(new Student(2, "Donald", "Green Bay, WI"));
        students.add(new Student(9, "Minnie", "Madison, WI"));
        students.add(new Student(1, "Goofy", "Appleton, WI"));
        students.add(new Student(7, "Huey", "Wausau, WI"));
        students.add(new Student(3, "Dewey", "Wausau, WI"));
        students.add(new Student(6, "Daisy", "Green Bay, WI"));
        students.add(new Student(10, "Louie", "Wausau, WI"));
        students.add(new Student(4, "Pete", "Janesville, WI"));
        students.add(new Student(8, "Pluto", "Milwaukee, WI"));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sorting by Name alphabetically
        StudentSort.selectionSort(students, new SortByName());
        System.out.println("\nSorted List by Name:");
        students.forEach(System.out::println);

        // Sorting by Roll Number
        StudentSort.selectionSort(students, new SortByRoll());
        System.out.println("\nSorted List by Roll Number:");
        students.forEach(System.out::println);
    }
}
