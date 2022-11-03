package favalgo;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> permute(String str){
        return permute(str, new ArrayList<>(), "");
    }
    public static List<String> permute(String str, List<String> permutations, String temp){
        if(str.length() == 0)
            permutations.add(temp);
        for(int i = 0; i < str.length(); i++){
            permute(str.substring(0,i)+ str.substring(i+1), permutations, temp+str.charAt(i));
        }
        return permutations;
    }

    public static void main(String[] args) {
        System.out.println(permute("abc"));
    }
}
