package dailychallenge;

public class RecursiveBinarySearch {
    public static int search(int [] nums, int num){
        if (nums.length == 0) return -1;
        return helper(nums, num, 0, nums.length-1);
    }
    private static int helper(int [] nums, int num, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(nums[mid] == num) return mid;
        if(nums[mid] < num)
            return helper(nums, num, mid+1, end);
        else
            return helper(nums, num, start, mid-1);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,9));
    }
}
