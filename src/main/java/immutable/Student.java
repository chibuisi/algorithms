package immutable;

public final class Student {
    private final int id;
    private final String name;
    private final Address address;

    public Student(int id, String name, Address address){
        this.id = id;
        this.name = name;
        Address add = new Address();
        add.setStreet(address.getStreet());
        add.setStreet(address.getState());
        add.setState(address.getState());
        add.setZip(address.getZip());
        this.address = add;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        Address newAddress = new Address();
        newAddress.setStreet(this.address.getStreet());
        newAddress.setCity(this.address.getCity());
        newAddress.setState(this.address.getState());
        newAddress.setZip(this.address.getZip());
        return newAddress;
    }
}
class Address{
    private  String street;
    private  String city;
    private  String state;
    private  String zip;

//    public Address(String street, String city, String state, String zip){
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.zip = zip;
//    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}