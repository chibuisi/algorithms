package keap.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solution(int [] nums, int k){
        Map<Integer, Integer> diff = new HashMap<>();
        for(int i : nums){
            if(!diff.containsKey(k - i))
                diff.put(i, k-i);
            else
                return new int[]{k-i, diff.get(k-i)};
        }
        return new int[]{-1,-1};
    }

    public static int[] solution2(int [] nums, int k){
        if(nums == null || nums.length == 0)
            return new int[]{-1,-1};
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k)
                return new int[]{nums[left], nums[right]};
            if(sum < k)
                left++;
            if(sum > k)
                right--;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int [] nums = {2,1,4,6};
        System.out.println(Arrays.toString(solution2(nums,7)));
    }
}
