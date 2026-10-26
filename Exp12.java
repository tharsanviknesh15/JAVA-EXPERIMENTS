import java.util.*;

public class EXPERIMENT12 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Bala");
        students.add("Arun");
        students.add("Ramesh");
        System.out.println("List: " + students);

        Set<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java");
        courses.add("C");
        System.out.println("Set: " + courses);

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(105,"Nayar");

        System.out.println("Map:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer("Arun");
        queue.offer("Bala");
        queue.offer("Charan");

        System.out.println("Queue: " + queue);
        System.out.println("Processed: " + queue.poll());
        System.out.println("Remaining: " + queue);
    }
}