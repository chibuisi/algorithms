package geeks;

import java.util.Arrays;

public class PythagorasTriplet {
    public static void main(String[] args) {
        int [] nums = {3,1,4,6,5};
        //int [] nums = {10,4,6,12,5};
        System.out.println(isTriplet(nums));
    }
    public static boolean isTriplet(int [] nums){
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int x = nums[i] * nums[i];
            int left = i + 1;
            int right = nums.length-1;
            while(left < right){
                int y = nums[left] * nums[left];
                int z = nums[right] * nums[right];
                if(x == y + z || y == x + z || z == x + y){
                    return true;
                }
                if(x > y + z)
                    left++;
                else
                    right--;
            }
        }
        return false;
    }
}
