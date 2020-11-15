package juliet;

import javax.print.DocFlavor;

public class Student extends Person{
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

    //primitive - int, long, boolean, char, byte, short, flaot, double
//wrapper - Integer, Long, Boolean, Character, Byte, Short, Float, Double

}
