package flexton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayIntegerPairSum {
    public static void main(String[] args) {
        int [] nums = {2,31,23,32,45,65,47,63,42,10,44,43,52,53,30,56};
        List<Integer[]> pairs = pairs(nums,33);
        ListIterator iterator = pairs.listIterator();
        for(Integer [] i : pairs){
            System.out.println(Arrays.toString(i));
        }
    }
    public static List<Integer[]> pairs(int [] nums, int target){
        List<Integer[]> pairs = new ArrayList<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                Integer [] newPair = {nums[left], nums[right]};
                pairs.add(newPair);
                left++;
                right--;
            }
            else if(sum > target)
                right--;
            else
                left++;
        }
        return pairs;
    }
}
