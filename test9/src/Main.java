import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hellow world");

        Runnable printFunc = () -> System.out.println("testing");
        Consumer<String> printCons = x -> System.out.println(x.toUpperCase());
        BinaryOperator<Integer> summ = (x, y) -> x * y;
        Supplier<Integer> randInt = () -> new Random().nextInt(100);
        BinaryOperator<String> getMaxLen = (s1, s2)-> s1.length() > s2.length() ? s1 : s2;
        Function<String, Integer> strToInt = x -> Integer.parseInt(x) * 2;

        List<String> names = List.of("John", "Mark", "Sarah");
        var countNames = names.stream().count();
        printCons.accept("номер: " + countNames);

        var firstRequest = new Random().ints(1000, 10 , 10000).boxed().collect(Collectors.toList());
        var secondRequest = new Random().ints(1000, 10 , 10000).filter(x -> x % 2 == 0).count();
        var thirdRequest = new Random().ints(1000, 10 , 10000).reduce(0, Integer::sum);
        new Random().ints(1000, 10 , 10000).distinct().limit(20).forEach(x -> printCons.accept(String.valueOf(x)));

        var fifthRequest = new Random().ints(1000, 10 , 10000)
                .boxed()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), i -> i*i));

        printCons.accept("номер: " + fifthRequest);

        List<String> sample = List.of("John", "Mark", "Sarah", "Megan", "Jake");
        sample.stream()
                .distinct()
                .filter(x -> x.length() > 4)
                .map(strToInt)
                .forEach(x -> printCons.accept(String.valueOf(x)));
    }}