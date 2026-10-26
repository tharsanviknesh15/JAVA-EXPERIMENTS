import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    public int compareTo(Student s) {
        return rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class EXPERIMENT13 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(103, "Shiva"));
        list.add(new Student(101, "Murugan"));
        list.add(new Student(102, "Bala"));

        Collections.sort(list);
        System.out.println("Sorted by Roll Number: " + list);

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name: " + list);
    }
}