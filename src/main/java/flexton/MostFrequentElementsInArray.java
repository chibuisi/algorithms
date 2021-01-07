package flexton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostFrequentElementsInArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,2,3,2,1,1,2,1,3,2,2,1,1,1};
        System.out.println(mostFrequent(nums,3));
    }
    public static List<Integer> mostFrequent(int [] nums, int n){
        List<Integer> count = new ArrayList<>();
        Arrays.sort(nums);
        int index = 0;
        for(int i = 0; i < n; i++){
            while(index < nums.length-1 && nums[index] == nums[index+1])
                index++;
            count.add(nums[index]);
            index++;
        }
//        int largest = nums[0];
//        int secondLargest = 0;
//        for(int i = 0; i < nums.length; i++){
//            int num = nums[i];
//            if(num > largest){
//                secondLargest = largest;
//                largest = num;
//            }
//        }

        return count;
    }
}
