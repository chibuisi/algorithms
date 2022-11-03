package dailybyte;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean solve(String one, String two){
        if(one.length() != two.length())
            return false;
        char [] cOne = one.toCharArray();
        char [] cTwo = two.toCharArray();
        Arrays.sort(cOne);
        Arrays.sort(cTwo);
        for(int i = 0; i < one.length(); i++){
            if(cOne[i] != cTwo[i])
                return false;
        }
        return true;
    }

    public static boolean solve2(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int [] arr = new int[24];
        for(int i = 0; i < s1.length(); i++){
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s1.length(); i++){
            if(arr[s1.charAt(i) - 'a'] != 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve("listen", "silent"));
        System.out.println(solve2("listen", "silent"));
        System.out.println(solve("books", "skobb"));
        System.out.println(solve2("books", "skobb"));
    }
}
