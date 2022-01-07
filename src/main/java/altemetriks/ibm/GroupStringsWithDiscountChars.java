package altemetriks.ibm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupStringsWithDiscountChars {
    public static void main(String[] args) {
        String str = "A horse is a farm animal";
        //groupStringWithDistinctCharCount(str);
        removePunctuationMarks("I, and Bre, will go to court.");;
    }
    public static void groupStringWithDistinctCharCount(String str){
        Map<String, Integer> groups = Arrays.stream(str.split(" ")).collect(Collectors.toMap(Function.identity(),
                s -> (int) s.chars().distinct().count()));
        System.out.println(groups);
    }

    public static void removePunctuationMarks(String str){
        String result = Arrays.stream(str.split(" ")).map(i -> Arrays.stream(i.split("")).filter(e -> Character.isAlphabetic(e.charAt(0))).collect(Collectors.joining(""))).collect(Collectors.joining(" "));
        System.out.println(result);
        createListOfWordsFromString(result);
    }

    public static void createListOfWordsFromString(String str){
        List<String> stringList = Stream.of(str.split(" ")).map(String::new).collect(Collectors.toList());
        System.out.println(stringList);
    }
}
