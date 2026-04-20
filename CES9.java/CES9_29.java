import java.util.*;
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(88);
        marks.add(92);
        marks.add(60);
        marks.add(81);

        System.out.println("All Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("\nHighest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
    }
}
