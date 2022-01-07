package dailychallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingSort {
    protected int count = 0;
    public static int [] solve(int [] nums){
        Map<Integer, Integer> counts = new HashMap();
        for(int i : nums){
            counts.put(i, counts.getOrDefault(i, 0)+1);
        }
        int index = 0;
        for(Map.Entry entry : counts.entrySet()){
            int count = (int) entry.getValue();
            for(int i = 0; i < count; i++)
                nums[index++] = (int) entry.getKey();
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] nums = {2,1,3,4,3,2,3,0,8,9,4,5};
        System.out.println(Arrays.toString(solve(nums)));
    }
}
