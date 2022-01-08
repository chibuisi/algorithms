package altemetriks;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2, 15,16,17,18,19 };
        int arr2[] = { 1, 9, 3, 10, 4, 20, 2 };
        System.out.println(countSequences(arr));
    }
    public static int countSequences(int [] nums){

        int maxCount = 0;
        Set<Integer> uniqueNums = new HashSet<>();
        for(int i : nums)
            uniqueNums.add(i);
        for(int i = 0; i < nums.length; i++) {
            int count = 1;
            if(!uniqueNums.contains(nums[i]-1)){
                int currNum = nums[i];
                while(uniqueNums.contains(currNum + 1)) {
                    count+=1;
                    currNum += 1;
                }
                if(count > maxCount)
                    maxCount = count;
            }
        }
        return maxCount;
    }
}
