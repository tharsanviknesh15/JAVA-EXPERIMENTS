import java.io.*;

public class EXPERIMENT14 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("student.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Student: Arun");
            bw.newLine();
            bw.write("Department: CSE");
            bw.close();

            System.out.println("File written successfully.");

            FileReader fr = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}