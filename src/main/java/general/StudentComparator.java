package general;

import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getName().equals(s2.getName()))
            return s1.getId() - s2.getId();
        return s1.getName().compareTo(s2.getName());
    }
}
class Solution{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(1, "Kelvin"), new Student(2, "Juliet"));
        System.out.println(students);
        students.sort(new StudentComparator());
        students.sort((s1,s2) -> {
            if(s1.getName().equals(s2.getName()))
                return s1.getId() - s2.getId();
            return s1.getName().compareTo(s2.getName());
        });
        Comparator<Student> comparator = (s1, s2) -> {
            if(s1.getName().equals(s2.getName()))
                return s1.getId() - s2.getId();
            return s1.getName().compareTo(s2.getName());
        };
        students.sort(comparator);
        Collections.sort(students);
        Collections.sort(students, comparator);
        //System.out.println(students);
    }
}
class SolutionMap{
    public static void main(String[] args) {
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("one", Arrays.asList(7,8,9,0));
        map.put("two", Arrays.asList(1,2,3,4));
        map.put("three", Arrays.asList(5,6,7,8));

        int sum = (int) map.entrySet().stream().flatMap(v -> v.getValue().stream()).collect(Collectors.summarizingInt(Integer::intValue)).getSum();
        System.out.println(sum);
    }
}