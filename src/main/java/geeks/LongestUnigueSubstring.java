package geeks;

import java.util.Set;
import java.util.TreeSet;

public class LongestUnigueSubstring {
    public static int solve(String str){
        if(str.isEmpty() || str == null)
            return -1;
        if(str.length() == 1)
            return 1;
        int count = 0;
        for(int i = 0; i <= str.length(); i++){
            for(int j = i; j <= str.length(); j++){
                String subStr = str.substring(i,j);
                if(!hasDups2(subStr))
                    count = Integer.max(count, subStr.length());
            }
        }
        return count;
    }
    private static boolean hasDups(String str){
        Set<Character> characterSet = new TreeSet<>();
        for(char c : str.toCharArray()){
            characterSet.add(c);
        }
        return str.length() == characterSet.size();
    }
    private static boolean hasDups2(String str){
        for(char c : str.toCharArray()){
            int firstIndex = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);
            if(firstIndex != lastIndex)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve("geeksforgeeks"));
    }
}
