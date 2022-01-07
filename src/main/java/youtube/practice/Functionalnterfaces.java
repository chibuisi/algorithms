package youtube.practice;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functionalnterfaces {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1,o2) -> o1.compareTo(o2);
        Integer result = comparator.compare(9,5);
        System.out.println(result);
    }

    public static void predicateExample(){
        Predicate<Integer> evenNumbers = x -> x % 2 == 0;
        boolean result = evenNumbers.test(5);
    }

    public static void consumerExample(){
        Consumer<String> printConsumer = t -> System.out.println(t);
        printConsumer.accept("Amsterdam");
    }

    public static void supplierExample(){
        Supplier<LocalDateTime> getLocalDate = () -> LocalDateTime.now();
        LocalDateTime currDate = getLocalDate.get();
    }

    public static void functionExample(){
        Function<String, String> addQuotes = s -> "'" + s + "'";
        String result = addQuotes.apply("Amsterdam");
    }

}
