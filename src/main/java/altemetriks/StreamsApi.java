package altemetriks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsApi {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("John",24),
                new Student("Kelvin",28),
                new Student("Andrew",30),
                new Student("Kedi",29)
        ));
        StreamsApi streamsApi = new StreamsApi();
        //streamsApi.getAverageValues(students);
        //streamsApi.sortList(students);
        //streamsApi.groupOccurencesOfSameWord();
        streamsApi.countOccurencesOfSameWord();
    }

    public void sortList(List<Student> students){
        students.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge)).forEach(System.out::println);
    }

    public void getAverageValues(List<Student> students){
        IntSummaryStatistics summary = students.stream().collect(Collectors.summarizingInt(Student::getAge));
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
        values.forEach((key, vals) -> System.out.println(key + ": " +vals.size()));
        System.out.println(values);
    }

    public void countOccurencesOfSameWord(){
        String s = "This sia eclipse eclipse random Eclipse ecliPse not a valid ECLIPSE sdfdsf sdfd";
        Map<String,Integer> values = Arrays.stream(s.split(" ")).filter(str -> str.equalsIgnoreCase("eclipse")).distinct()
                .collect(Collectors.toMap(Function.identity(),
                        str->Collections.frequency(Arrays.asList(s.split(" ")),str)));
        System.out.println(values);
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age){
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
