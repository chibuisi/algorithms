package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {
    public static List<Integer> solve(List<Integer> nums, int d){
        List<Integer> result = new ArrayList<>(nums);

        if(d > nums.size())
            d = d % nums.size();

        int index = 0;
        for(int i = d; i < nums.size(); i++){
            result.set(index++,nums.get(i));
        }

        for(int i = 0; i < d; i++){
            result.set(index++,nums.get(i));
        }

        return result;
    }

    public static void solve2(List<Integer> nums, int d){
        reverse(nums, 0, nums.size()-1);
        reverse(nums, 0, d-1);
        reverse(nums, d, nums.size()-1);
    }

    public static void reverse(List<Integer> nums, int start, int end){
        while(start < end){
            int numsStart = nums.get(start);
            int numsEnd = nums.get(end);
            nums.set(start, numsEnd);
            nums.set(end, numsStart);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(solve(nums,2));

        solve2(nums, 2);
        System.out.println(nums);
        /*int temp = nums.get(0);
        nums.remove(0);
        nums.add(0, nums.get(nums.size()-1));
        nums.add(nums.size()-1, temp);
        nums.remove(nums.size()-1);*/
        //System.out.println(nums);
    }
}
