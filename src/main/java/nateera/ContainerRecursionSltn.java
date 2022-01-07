package nateera;

public class ContainerRecursionSltn {
    public static void main(String[] args) {
        Container2 a = new Container2(null,"aaa");
        Container2 b = new Container2(a,"bbb");
        Container2 c = new Container2(b, "ccc");

        print(c);
    }

    public static void print(Container2 c){
        if(c.parent != null)
            print(c.parent);
        System.out.println(c.name);
    }
}
class Container2{
    String name;
    Container2 parent;

    public Container2(Container2 parent, String name){
        this.parent = parent;
        this.name = name;
    }
}
