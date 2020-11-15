package juliet;

import java.util.List;

public class Professor extends Person{
    private Long id;
    private List<Student> students;

    public Professor(){

    }

    public Professor(String firstName, String lastName, int age, Long id, List<Student> students) {
        super(firstName, lastName, age);
        this.id = id;
        this.students = students;
    }

    public Professor(Long id, List<Student> students) {
        this.id = id;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                super.toString() +
                ", students=" + students +
                '}';
    }
}
