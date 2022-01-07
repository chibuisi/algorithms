package dailychallenge;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static String solve(String str){
        Map<String, Integer> wordCount = new HashMap<>();
        for(String s : str.split(" ")){
            if(!wordCount.containsKey(s))
                wordCount.put(s,1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry entry : wordCount.entrySet()){
            if((int) entry.getValue() == 1)
                result.append(entry.getKey() + " ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "The big big black boy and black hat";
        System.out.println(solve(str));
    }
}
