package riotgames.practice;

import java.util.Arrays;

public class FirstLastPositionInSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,4,4,5,6,7};
        System.out.println(Arrays.toString(findPositions(nums,4)));
    }
    public static int [] findPositions(int [] nums, int target){
        int [] positions = new int[2];
        positions[0] = findFirstPosition(nums, target);
        positions[1] = findLastPosition(nums,target);
        return positions;
    }
    private static int findFirstPosition(int [] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                index = mid;
            if(nums[mid] >= target)
                end = mid - 1;
            else
                start = mid + 1;

        }
        return index;
    }

    private static int findLastPosition(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                index = mid;

            if(nums[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
            if(nums[mid] == target)
                index = mid;
        }
        return index;
    }

}
