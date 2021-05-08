package altemetriks.altfor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(test("abbaabc"));
    }
    public static int test(String text){
        Map<Character, Integer> count = new HashMap<>();
        for(char c : text.toCharArray()){
            if(count.containsKey(c)){
                count.put(c, count.get(c)+1);
            }
            else{
                count.put(c,1);
            }
        }
        int largest = 0;
        for(Map.Entry entry : count.entrySet()){
            if((int)entry.getValue() > largest){
                largest = (int)entry.getValue();
            }
        }
        return largest;
    }
    public static char test2(String text){
        int [] chars = new int[256];
        for(char c : text.toCharArray()){
            chars[c] = chars[c]++;
        }
        int largest = 0;
        for(int i = 0; i < 256; i++){
            if(chars[i] > largest)
                largest = chars[i];
        }
        return 'a';
    }
}
