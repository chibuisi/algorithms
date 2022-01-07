package nateera;

public class Container {
    private Container parent;
    private String name;

    public Container(Container parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    public Container() {
    }

    public Container getParent() {
        return parent;
    }

    public void setParent(Container parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
