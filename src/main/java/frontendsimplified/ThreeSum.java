package frontendsimplified;

import java.util.*;

public class ThreeSum {
    public static List<Integer[]> solve(int [] array, int target){
        List<Integer[]> result = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            int left = i + 1;
            int right = array.length - 1;
            while(left < right) {
                int sum = array[i] + array[left] + array[right];
                if (sum == target) {
                    result.add(new Integer[]{array[i], array[left], array[right]});
                    left++;
                    right--;
                }
                if(sum < target)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }

    public static List<Integer[]> solve2(int [] array, int target){
        List<Integer[]> result = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            Set<Integer> diffSet = new HashSet<>();
            int currTarget = target - array[i];
            for(int j = i + 1; j < array.length; j++){
                if(diffSet.contains(currTarget - array[j])){
                    result.add(new Integer[]{array[i], array[j], currTarget - array[j]});
                }
                else
                    diffSet.add(array[j]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {7, 12, 3, 1, 2, -6, 5, -8, 6};

        solve2(array, 0).forEach(e -> {
            System.out.println(Arrays.toString(e));
        }); //[[2, -8, 6], [3, 5, -8], [1, -6, 5]]
    }
}
