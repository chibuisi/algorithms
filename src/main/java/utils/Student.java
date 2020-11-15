package utils;

public class Student {
    private String id;
    private Address address;

    public Student(String id, Address address) {
        this.id = id;
        this.address = address;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", address=" + address +
                '}';
    }
}
class Address{
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                '}';
    }
}
