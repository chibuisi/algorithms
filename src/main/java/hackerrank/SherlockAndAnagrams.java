package hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        int result = 0;
        Map<String, Integer> anagramCounts = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                String sub = s.substring(i,j+1);
                char [] charArray = sub.toCharArray();
                Arrays.sort(charArray);
                String sortedStr = new String(charArray);
                if(anagramCounts.containsKey(sortedStr)){
                    anagramCounts.put(sortedStr, anagramCounts.get(sortedStr)+1);
                    //result+=1;
                }
                else{
                    anagramCounts.put(sortedStr,1);
                }
            }
        }
        for(Map.Entry entry : anagramCounts.entrySet()){
            int freq = (int) entry.getValue();
            result += freq - 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("cdcd"));
    }
}
