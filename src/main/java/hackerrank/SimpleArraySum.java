package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArraySum {
    public static int solve(List<Integer> nums){
        List<Integer> ints = new ArrayList<>(nums);

        return nums.stream().reduce((i,e) -> i+e).get();
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4);
        System.out.println(solve(nums));
    }
}
