package dailybyte2022;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //[1, 3, 8, 2], k = 10, return true (8 + 2)
    //[3, 9, 13, 7], k = 8, return false
    //[4, 2, 6, 5, 2], k = 4, return true (2 + 2)

    public static boolean solve(int [] nums, int target){
        Map<Integer, Integer> diff = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(diff.containsKey(target-nums[i]))
                return true;
            diff.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,3,8,2}, 10));
        System.out.println(solve(new int[]{3,9,13,7}, 8));
        System.out.println(solve(new int[]{4,2,6,5,2}, 4));
    }
}
