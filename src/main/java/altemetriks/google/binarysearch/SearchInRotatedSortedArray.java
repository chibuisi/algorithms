package altemetriks.google.binarysearch;

public class SearchInRotatedSortedArray {
    public static int solve(int [] nums, int key){
        if(nums == null || nums.length == 0)
            return -1;
        int start = 0;
        int end = nums.length-1;
        //find pivot index
        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end])
                start = mid + 1;
            else
                end = mid;
        }

        int left = 0;
        int right = nums.length-1;
        if(key >= nums[start] && key <= nums[right])
            left = start;
        else
            right = start;
        //do a regular binary search
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(key == nums[mid])
                return mid;
            else if(key < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{7,1,2,3,4,5,6},2));
    }
}
