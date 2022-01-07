package dailychallenge;

public class PassByReference {
    static void change(Test t){
        t.name = "friy";
    }
    public static void main(String[] args) {
        Test s = new Test("mystring");
        change(s);
        System.out.println(s.name);
        StringBuilder str = new StringBuilder("adre");
        String test = "adre";
        System.out.println(test.indexOf("a"));
        int index = str.indexOf("a");
    }
}
class Test{
    String name;
    public Test(String name){
        this.name = name;
    }
}