package juliet.miu;

public class Fruit {
    private String name;

    public Fruit(){}

    public Fruit(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        Fruit fruit = (Fruit) o;
        return this.name.equals(fruit.name);
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("Apple");
        Fruit mango = new Fruit("Apple");
        System.out.println(mango.equals(apple));
    }
}
