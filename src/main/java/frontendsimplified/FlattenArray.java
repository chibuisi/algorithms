package frontendsimplified;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {
    static List<Integer> result = new ArrayList<>();
    static int index = 0;
    public static List<Integer> solve(List<NestedInteger> list){
        for(int i = 0; i < list.size(); i++){
            flatten(list.get(i));
        }
        return result;
    }

    static void flatten(NestedInteger integers){
        if(integers.isInteger()){
            result.add(integers.getInteger());
        }
        else {
            for(NestedInteger i : integers.getList()){
                flatten(i);
            }
        }
    }

    private static Stream<Object> flatten(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[]? flatten((Object[])o): Stream.of(o));
    }

    public static void main(String[] args) {
        //1,4,1,2,3,8
        NestedInteger one = new NestedInteger(1);
        NestedInteger two = new NestedInteger(2);
        NestedInteger three = new NestedInteger(3);
        List<NestedInteger> list = Arrays.asList(one, two, three);
        List<NestedInteger> nestedIntegers = Arrays.asList(new NestedInteger(1),
                new NestedInteger(list), new NestedInteger(8));
        System.out.println(solve(nestedIntegers));
    }
}

class NestedInteger{
    int one;
    List<NestedInteger> two;

    public NestedInteger(int one){
        this.one = one;
    }

    public NestedInteger(List<NestedInteger> two){
        this.two = two;
    }

    public NestedInteger(int one, List<NestedInteger> two){
        this.one = one;
        this.two = two;
    }

    public int getInteger(){
        return this.one;
    }

    public List<NestedInteger> getList(){
        return this.two;
    }

    public boolean isInteger(){
        return this.getList() == null;
    }
}