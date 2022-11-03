package frontendsimplified;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] solve(int [] array, int k){
        Map<Integer, Integer> integerMap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int complement = k - array[i];
            if(integerMap.containsKey(complement))
                return new int[]{i, integerMap.get(complement)};
            else
                integerMap.put(array[i], i);
        }
        return new int[]{};
    }

    //time = O(nlogn)
    public static int[] solve2(int [] array, int k){
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while(left < right){
            if(array[left] + array[right] == k)
                return new int[]{left,right};
            if(array[left] + array[right] < k)
                left++;
            else
                right--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int [] array = {2,3,4,7,9,8};
        System.out.println(Arrays.toString(solve2(array, 6)));
    }
}
