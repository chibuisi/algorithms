package keap;

import java.util.Arrays;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        int index = 0;
        while(index < c1.length){
            if(c1[index] != c2[index])
                return false;
            index+=1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("silent", "listen"));
    }
}
