package geeks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {3,3,4,2,4,4,2,4,4};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int []nums){
        Map<Integer,Integer> numbers = new HashMap<>();
        int largeValue = -1;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(numbers.containsKey(value)){
                numbers.put(value, numbers.get(value)+1);
                if(numbers.get(value) >= (nums.length/2)){
                    largeValue = value;
                }
            }
            else{
                numbers.put(value, 1);
            }
        }
        return largeValue;
    }
}
