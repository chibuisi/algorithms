package flexton.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
         new Employee(101, "Hemendra Singh Chouhan", Arrays.asList("Java", "Spring Boot", "Hibernate")),
         new Employee(105, "Rebeca", Arrays.asList("Java", "Marketing")),
                 new Employee(102, "Rebeca", Arrays.asList("Java", "Marketing")),
         new Employee(103, "David",
                 Arrays.asList("Payroll Management", "Human Resource", "Leaves", "Time Sheet")),
         new Employee(104, "Robin", Arrays.asList("Medicine", "Surgery")));
//        employees.sort((e1,e2) -> {
//            if (e1.getCourses().size() > e2.getCourses().size()){
//                return 1;
//            }
//            else if(e1.getCourses().size() < e2.getCourses().size()){
//                return -1;
//            }
//            else{
//                return 0;
//            }
//        });
        System.out.println(employees);
//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                if (e1.getCourses().size() > e2.getCourses().size()){
//                    return 1;
//                }
//                else if(e1.getCourses().size() < e2.getCourses().size()){
//                    return -1;
//                }
//                else{
//                    return 0;
//                }
//            }
//        });

        //Collections.sort(employees, Collections.reverseOrder());
        //Collections.sort(employees);
//        Collections.sort(employees, (e1,e2) -> {
//            if (e1.getCourses().size() > e2.getCourses().size()){
//                return 1;
//            }
//            else if(e1.getCourses().size() < e2.getCourses().size()){
//                return -1;
//            }
//            else{
//                return 0;
//            }
//        });
        Comparator<Employee> comparator = (e1,e2) -> {
            if (e1.getCourses().size() > e2.getCourses().size()){
                return 1;
            }
            else if(e1.getCourses().size() < e2.getCourses().size()){
                return -1;
            }
            else{
                return 0;
            }
        };
        List<Employee> sorted = employees.stream().sorted(comparator).collect(Collectors.toList());
        //sort reverse by number of courses
        List<Employee> sortedEmployeesReverse = employees.stream().sorted(Comparator.comparing(e -> e.getCourses().size(), Comparator.reverseOrder())).collect(Collectors.toList());
        //sort by number courses
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(e -> e.getCourses().size())).collect(Collectors.toList());
        //multiple comparators
        List<Employee> emps = employees.stream().sorted(Comparator.comparing(Employee::getCoursesSize).thenComparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());
        //System.out.println(sortedEmployeesReverse);
        //System.out.println(sortedEmployees);
        //System.out.println(sorted);
        System.out.println(emps);
    }
}
