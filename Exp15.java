import java.io.*;

class Student implements Serializable {
    int rollNo;
    String name;
    double cgpa;

    Student(int r, String n, double c) {
        rollNo = r;
        name = n;
        cgpa = c;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class EXPERIMENT15 {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Arun", 9.2);

            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("student.dat"));

            out.writeObject(s);
            out.close();

            System.out.println("Serialization successful.");

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("student.dat"));

            Student s1 = (Student) in.readObject();
            in.close();

            System.out.println("Deserialization successful.");
            s1.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}