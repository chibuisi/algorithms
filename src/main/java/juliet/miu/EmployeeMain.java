package juliet.miu;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Juliet", "Nduka", 200.36, LocalDate.of(2100, 01, 22)),
                new Employee("Kelvin", "Amiaka", 230.36, LocalDate.of(2000, 11, 22)),
                new Employee("Anna", "Harry", 300.36, LocalDate.of(2010, 9, 22)),
                new Employee("Bob", "Joseph", 390.36, LocalDate.of(2009, 5, 22))
        );

        Comparator<Employee> sortByFirstname = (e1,e2) -> e1.getFirstname().compareTo(e2.getFirstname());
//        Comparator<Employee> sortByLastname = (e1,e2) -> e1.getFirstname().compareTo(e2.getFirstname());
//        Comparator<Employee> sortBySalary = (e1,e2) -> e1.getFirstname().compareTo(e2.getFirstname());
//        Comparator<Employee> sortByHireDate = (e1,e2) -> e1.getFirstname().compareTo(e2.getFirstname());

        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };
        System.out.println(employees);

        Collections.sort(employees, sortByFirstname);
        Collections.sort(employees, comparator);

        System.out.println(employees);

    }
}
