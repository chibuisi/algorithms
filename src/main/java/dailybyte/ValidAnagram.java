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

    public static void main(String[] args) {
        System.out.println(solve("listen", "silent"));
        System.out.println(solve("books", "skobb"));
    }
}
