package altemetriks.riot;

import java.util.Arrays;
import java.util.List;

public class PlusOneArray {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3);
        System.out.println(solutionOne(nums));
    }
    public static int solutionOne(List<Integer> nums){
        int num = 0;
        for(int i : nums){
            num = (num * 10) + i;
        }
        return num + 1;
    }
}
