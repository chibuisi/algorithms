package dailybyte2022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeastUniqueElements {
    public static int solve(int [] nums, int k){
        Set<Integer> vals = new HashSet<>();
        Arrays.stream(nums).forEach(v -> vals.add(v));
        for(int i = 0; i < k; i++){
            vals.remove(nums[i]);
        }
        return vals.size();
    }

    public static void main(String[] args) {
        int [] nums = {1,4,3,3};
        System.out.println(solve(nums,2));
    }
}
