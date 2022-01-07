package dailychallenge.permutation;

import java.util.ArrayList;
import java.util.List;

public class Recursive {
    public static List<String> permutations(String str){
        return permute(new ArrayList<>(), str, "");
    }

    private static List<String> permute(List<String> permutations, String str, String temp){
        if(str.length() == 0)
            permutations.add(temp);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            permute(permutations, str.substring(0,i)+str.substring(i+1),temp+c);
        }
        return permutations;
    }

    public static void main(String[] args) {
        System.out.println(permutations("abc"));
    }
}
