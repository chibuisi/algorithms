package dailybyte2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SpellingBee {
    public static String [] solution1(int [] scores){
        String [] result = new String[scores.length];
        Map<Integer, String> rewards = new HashMap<>();
        rewards.put(5,"Gold Medal");
        rewards.put(4,"Silver Medal");
        rewards.put(3,"Bronze Medal");
        rewards.put(2,"4");
        rewards.put(1,"5");
        for(int i = 0; i < scores.length; i++){
            result[i] = rewards.get(scores[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] scores = {3,1,4,2,5};
        System.out.println(Arrays.toString(solution1(scores)));
    }
}
