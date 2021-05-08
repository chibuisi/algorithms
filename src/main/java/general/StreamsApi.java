package general;

import java.util.*;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        List<Student1> students = new ArrayList<>(Arrays.asList(
                new Student1("John",24),
                new Student1("Kelvin",28),
                new Student1("Andrew",30),
                new Student1("Kedi",29)
        ));
        StreamsApi streamsApi = new StreamsApi();
        //streamsApi.getAverageValues(students);
        //streamsApi.sortList(students);
        //streamsApi.groupOccurencesOfSameWord();
        streamsApi.countOccurencesOfSameWord();
    }

    public void sortList(List<Student1> students){
        students.stream().sorted(Comparator.comparing(Student1::getName).thenComparing(Student1::getAge)).forEach(System.out::println);
    }

    public void getAverageValues(List<Student1> students){
        IntSummaryStatistics summary = students.stream().collect(Collectors.summarizingInt(Student1::getAge));
        int max = summary.getMax();
        int min = summary.getMin();
        double ave = summary.getAverage();
        long count = summary.getCount();
        System.out.println(max);
    }

    public void groupOccurencesOfSameWord(){
        String str = "This sia eclipse eclipse random Eclipse ecliPse not a valid ECLIPSE sdfdsf sdfd";
        Map<String,List<String>> values = Arrays.stream(str.split(" ")).map(String::toLowerCase)
                .collect((Collectors.groupingBy(Function.identity())));
        //values.forEach((s, strings) -> System.out.println(strings));
        //values.forEach((key, vals) -> System.out.println(key + ": " +vals.size()));
        System.out.println(values);
    }

    public void countOccurencesOfSameWord(){
        String s = "This sia eclipse eclipse random Eclipse ecliPse not a valid ECLIPSE sdfdsf sdfd";
        Map<String,Integer> values = Arrays.stream(s.split(" ")).filter(str -> str.equalsIgnoreCase("eclipse")).distinct()
                .collect(Collectors.toMap(Function.identity(),
                        str-> Collections.frequency(Arrays.asList(s.split(" ")),str)));
        System.out.println(values);
    }
}
class Student1{
    private String name;
    private int age;

    public Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
