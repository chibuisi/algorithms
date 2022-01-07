package keap.binarysearch;

public class BinarySearch {
    public static int solution1(int [] nums, int key){
        if(nums == null || nums.length == 0)
            return -1;
        return search(nums, key, 0, nums.length-1);
    }
    private static int search(int [] nums, int key, int start, int end){
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if(nums[mid] == key)
            return mid;
        else if(nums[mid] > key)
            return search(nums, key, start, mid-1);
        else
            return search(nums, key, mid+1, end);
    }

    public static int solution2(int [] nums, int key){
        if(nums == null || nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == key)
                return mid;
            else if(nums[mid] > key)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,3,5,6,7,9};
        System.out.println(solution2(nums, 7));
    }
}
