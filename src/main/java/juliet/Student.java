package juliet;

import juliet.miu.Fruit;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student extends Person implements Comparable<Student>{
    private Long studentId;

    public Student(String firstName, String lastName, int age){
        super(firstName,lastName,age);
    }

    public Student(){

    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        String s = "{Student ID : " + studentId + ", " + super.toString();
        return s;
    }

    @Override
    public int compareTo(Student s) {
        return this.getFirstName().compareTo(s.getFirstName());
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Person)) {
            return false;
        }

//        Student s = (Student) o;
//        if(this.studentId != null && s.getStudentId() != null)
//            return this.getStudentId().equals(s.getStudentId());
//        else
//            return false;
        return super.equals(o);
    }

    public static void main(String[] args) {
        Student one = new Student("Zann", "White", 20);
        Student two = new Student("Zann", "White", 19);
        Student three = new Student("John", "White", 20);
        List<Student> students = Arrays.asList(one, two, three);
        Student [] array = {one, two, three};
//        Arrays.sort(array);
//        Collections.sort(students);
//        System.out.println(students);
//        System.out.println(Arrays.toString(array));
        System.out.println(one.equals(two));
    }

    //primitive - int, long, boolean, char, byte, short, flaot, double
//wrapper - Integer, Long, Boolean, Character, Byte, Short, Float, Double

}
