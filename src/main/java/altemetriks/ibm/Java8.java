package altemetriks.ibm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        streamWithPredicate();
    }

    private static void streamScores() {
        List<Integer> scores = Arrays.asList(34,45,12,33,67,99,46,72,64,87);
        List<Integer> editScores = scores.stream().map(Java8::addFive).sorted().collect(Collectors.toList());
        System.out.println(editScores);
    }

    private static int addFive(int num){
        if (num % 2 == 0){
            num += 5;
        }
        return num;
    }

    public static void streamWithStrings(){
        Stream.of("34","32").mapToInt(Integer::valueOf).map(x -> x + 5).forEach(System.out::println);
        Stream.of(1,1,2,3,4,2,3,4,5).max(Integer::compareTo).ifPresent(System.out::println);
        Stream.of(1,1,2,3,4,2,3,4,5).max(Integer::compareTo).ifPresent(System.out::println);
    }

    public static void streamJoining(){
        String result = Stream.of("Honda", "Toyota").collect(Collectors.joining(", ", "We have ", " newer models."));
        System.out.println(result);
    }

    public static void streamFlatMap(){
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,4,2,3), Arrays.asList(2,3,5,4));
        list.stream().map(i -> i.stream().reduce(0, (t, e) -> t+e)).forEach(System.out::println);
        int total = list.stream().map(i -> i.stream().reduce(0, (t, e) -> t+e)).reduce(0, (t,e) -> t+e);
        System.out.println(total);
    }

    public static void streamWithPredicate(){
        Predicate<Integer> predicate = (value) -> value > 3;
        Stream.of(1,2,3,2,1,2,3,2,3,5,6).filter(predicate).forEach(System.out::println);
        /*
        * Predicate<T> - boolean test(t) : Evaluates this predicate on the given argument
        * Consumer<T> -  void accept(t) :
        * Function<T,R> - R apply(t) : Applies this function to the given argument
        * Supplier<T> - T get() : Gets a result
        * */
    }
}
