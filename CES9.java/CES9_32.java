import java.util.LinkedList;

public class Main {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Roll number 103 found: " +
                searchElement(rollNumbers, 103));

        System.out.println("Roll number 200 found: " +
                searchElement(rollNumbers, 200));

        LinkedList<String> names = new LinkedList<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Sneha");
        names.add("Priya");

        System.out.println("\nName 'Amit' found: " +
                searchElement(names, "Amit"));

        System.out.println("Name 'John' found: " +
                searchElement(names, "John"));
    }
}
