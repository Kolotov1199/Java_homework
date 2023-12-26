import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .map(String::length)
                .forEach(System.out::println);

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        long count = names.stream()
                .filter(name -> name.length() > 4)
                .count();
        System.out.println(count);
    }
}