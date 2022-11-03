package frontendsimplified;

import java.util.Arrays;

public class Anagrams {
    public static boolean solve(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0; i < c1.length; i++){
            if(c1[i] != c2[i])
                return false;
        }
        return true;
    }

    public static boolean solve2(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int [] count = new int[256];
        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i = 0; i < count.length; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve("iceman", "cinema"));
        System.out.println(solve2("iceman", "cinema"));
    }
}
