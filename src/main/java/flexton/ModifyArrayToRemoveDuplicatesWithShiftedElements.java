package flexton;

import java.util.Arrays;

public class ModifyArrayToRemoveDuplicatesWithShiftedElements {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3,3,3,3,3,4,5,5,6,6,6,7,8,8,11,11,11,11};
        System.out.println(modifyAndShift(nums));
        System.out.println(Arrays.toString(nums));
    }
    public static int modifyAndShift(int [] nums){
        int fastIndex = 0;
        int slowIndex = 0;
        int count = 0;
        while(fastIndex < nums.length){
            while(fastIndex < nums.length-1 && nums[fastIndex] == nums[fastIndex+1])
                fastIndex++;
            if(fastIndex < nums.length-1 && slowIndex < nums.length)
                nums[slowIndex+1] = nums[fastIndex+1];
            fastIndex++;
            slowIndex++;
        }
        count = slowIndex;
        while(slowIndex < nums.length)
            nums[slowIndex++] = 0;
        return count;
    }
}
