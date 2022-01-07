package altemetriks.google.binarysearch;

import java.util.Arrays;

public class FindHighAndLowIndex {
    public static int[] solve(int [] nums, int target){
        if(nums == null || nums.length == 0)
            return new int[]{-1,-1};
        int [] indexes = new int[2];
        indexes[0] = findLeftIndex(nums, 0, nums.length-1, target);
        indexes[1] = findRightIndex(nums, 0, nums.length-1, target);
        return indexes;
    }

    private static int findRightIndex(int[] nums, int start, int end, int target) {
        int index = -1;
        if(start > end)
            return index;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] <= nums[mid + 1])
                start = mid + 1;
            else
                end = mid - 1;
            if(nums[mid] == target)
                index = target;
        }
        return index;
    }

    private static int findLeftIndex(int[] nums, int start, int end, int target) {
        int index = -1;
        if(start > end)
            return index;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] >= mid-1)
                end = mid - 1;
            else
                start = mid + 1;
            if(nums[mid] == target)
                index = mid;
        }

        return index;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,4,5,6};
        int [] index = solve(nums, 4);
        System.out.println(Arrays.toString(index));
    }
}
