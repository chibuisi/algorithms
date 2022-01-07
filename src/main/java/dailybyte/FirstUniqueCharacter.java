package dailybyte;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static int solve(String str){
        for(char c : str.toCharArray()){
            int firstIndex = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);
            if(firstIndex == lastIndex)
                return firstIndex;
        }
        return -1;
    }
    public static int solve2(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        return map.entrySet().stream().filter(entry -> (int) entry.getValue() == 1).findFirst().map(entry -> (int) entry.getKey()).orElse(-1);
    }

    //abcabd
    public static void main(String[] args) {
        System.out.println(solve("abcabd"));
    }
}
