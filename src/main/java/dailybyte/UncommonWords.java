package dailybyte;

import java.util.*;

public class UncommonWords {
    public static String [] solve(String s1, String s2){
        if(s1 == null || s2 == null || s1.length() == 0 || s2.length() == 0)
            return new String[0];

        Set<String> strings = new HashSet<>();
        for(String s : s1.split(" ")){
            strings.add(s);
        }

        List<String> result = new ArrayList<>();

        for(String s : s2.split(" ")){
            if(!strings.contains(s)){
                result.add(s);
            }
        }


        String [] str = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            str[i] = result.get(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String s1 = "the quick";
        String s2 = "brown fox the quick";
        System.out.println(Arrays.toString(solve(s1,s2)));
    }
}
