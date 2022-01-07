package hackerrank;

import java.util.Arrays;
import java.util.List;

public class SimpleDiagonalDifference {
    public static int solve(List<List<Integer>> nums){
        int l2r = 0;
        for(int i = 0; i < nums.size(); i++){
            l2r += nums.get(i).get(i);
        }

        int r2l = 0;
        for(int i = 0; i < nums.size(); i++){
            r2l += nums.get(i).get(nums.size()-1-i);
        }

        return Math.abs(l2r - r2l);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(3,4,5),
                Arrays.asList(8,7,1),
                Arrays.asList(4,6,3)
        );

        System.out.println(solve(list));
    }
}
