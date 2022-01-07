package hackerrank;

import java.util.*;

public class RansomNotes {
    public static void solve(List<String> magazine, List<String> note){

    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test");
        list.add("test2");
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test");
        list.add("test4");
        list.add("test4");

        list.remove("test");
        int index = list.indexOf("test5");
        System.out.println(index);
    }
}
