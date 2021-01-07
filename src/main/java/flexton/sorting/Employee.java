package flexton.sorting;

import java.util.List;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private List<String> courses;

    public Employee(Integer id, String name, List<String> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public Integer getCoursesSize(){ return getCourses().size(); }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        if (this.getCourses().size() > e.getCourses().size())
                return 1;
            else if(this.getCourses().size() < e.getCourses().size())
                return -1;
            else{
                if(this.getName().compareTo(e.getName()) > 1)
                    return 1;
                else if(this.getName().compareTo(e.getName()) < 1)
                    return -1;
                else{
                    if(this.getId().compareTo(e.getId()) > 1)
                        return 1;
                    else if(this.getId().compareTo(e.getId()) < 1)
                        return -1;
                    else
                        return 0;
                }
            }
    }
}
