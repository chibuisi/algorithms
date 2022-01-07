package nickwhite.binarysearch;

import java.util.Arrays;

public class FindLastPositionInSortedArray {
    public static int[] solve(int [] nums, int target){
        if(nums ==null || nums.length ==0)
            return new int[]{-1,-1};
        int [] positions = new int[2];
        positions[0] = findFirstPositions(nums, target);
        positions[1] = findLastPositions(nums, target);

        return positions;
    }

    private static int findFirstPositions(int [] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
            if(nums[mid] == target)
                index = mid;
        }

        return index;
    }

    private static int findLastPositions(int [] nums, int target){
        int index = -1;
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = left + (right - left)/ 2;
            if(nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
            if(nums[mid] == target)
                index = mid;
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3,4,4,4,5,6}, 4)));
    }
}
