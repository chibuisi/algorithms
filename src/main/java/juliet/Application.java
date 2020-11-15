package juliet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application ob = new Application();


        Address address = new Address("1000 N Str", "Phoenix", "Arizona", "85021");
        Student juliet = new Student();
        juliet.setFirstName("Nduka");
        juliet.setAge(28);
        juliet.setStudentId(100L);
        juliet.setAddress(address);


        Professor kelvin = new Professor();
        kelvin.setFirstName("Amiaka");
        kelvin.setAge(30);
        kelvin.setId(101L);
        kelvin.setAddress(new Address("2000 W Str", "Austin", "Texas", "87021"));
        List<Student> students = Arrays.asList(juliet);
        kelvin.setStudents(students);

        System.out.println(kelvin);

    }
}
