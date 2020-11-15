package juliet;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;

    public Person(String firstName, String lastName, int age){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FirstName =" + firstName + " " + ", LastName= " + lastName + ",Age = " + age +", Address=" + address +
                '}';
    }
}
