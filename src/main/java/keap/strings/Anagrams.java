package keap.strings;

import java.util.Arrays;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2){
        if((str1 == null && str2 == null) || (str1.length() != str2.length()))
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

    public static void main(String[] args) {
        System.out.println(areAnagrams("gold", "logl"));
    }
}
