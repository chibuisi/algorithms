package flexton;

import java.util.Arrays;

public class ReaarangePositiveNegative {
    public static void main(String[] args) {
        int [] nums = {12,11,-13,-5,6,-7,5,-3,-6};
        rearrange(nums);
        System.out.println(Arrays.toString(nums));
    }

    //this algorithm maintains order of appearance
    public static void rearrange(int [] nums){
        int indexNeg = 0;
        while(indexNeg < nums.length-1){
            while(indexNeg < nums.length-1 && nums[indexNeg] > 0)
                indexNeg+=1;
            int index = indexNeg;
            int negNum = nums[index];

            while(index > 0 && nums[index-1] > 0) {
                nums[index] = nums[index-1];
                index -= 1;
            }
            nums[index] = negNum;
        }
    }
}
