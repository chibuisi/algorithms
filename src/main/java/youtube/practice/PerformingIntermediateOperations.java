package youtube.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PerformingIntermediateOperations {
    public static void main(String[] args) {
        maxExample();
    }

    public static void filterExample(){
        List<String> stringsList = Arrays.asList("one", "Three", "two", "eight", "seven", "nine");
        Stream<String> stringsStream = stringsList.stream().filter(s -> s.length() >= 5);
    }

    public static void mapExample(){
        List<String> stringsList = Arrays.asList("one", "Three", "two", "eight", "seven", "nine");
        Stream<String> strings = stringsList.stream().map(s -> s.toUpperCase());
    }

    public static void minExample(){
        List<String> stringsList = Arrays.asList("one", "Three", "two", "eight", "seven", "nine");
        Optional<String> stringsMin = stringsList.stream().min((s1, s2) -> new Integer(s1.length()).compareTo(new Integer(s2.length())));
    }

    public static void maxExample(){
        List<String> stringsList = Arrays.asList("one", "Three", "two", "eight", "seven", "nine");
        Optional<String> stringsMax = stringsList.stream().max((s1, s2) -> new Integer(s1.length()).compareTo(new Integer(s2.length())));
    }

    public static void sortedExample(){
        List<String> stringsList = Arrays.asList("one", "Three", "two", "eight", "seven", "nine");
        Stream<String> sortedStream = stringsList.stream().sorted(Comparator.comparing(String::length));
    }
}
