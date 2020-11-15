package geeks;

public class CeilingOfElement {
    public static void main(String[] args) {
        int [] nums = {1,3,4,5,6,7,8,9,10,12,13,15};
        System.out.println(searchCeiling(nums, 0, nums.length-1, 3));
    }
    public static int searchCeiling(int [] nums, int start, int end, int x){
        if(x <= nums[start]) return start;
        if(x > nums[nums.length-1]) return -1;
        int mid = (start + end) / 2;
        if(nums[mid] == x) return mid;
        if(nums[mid] > x){
            if(mid - 1 >= start && nums[mid - 1] >= x)
                return mid - 1;
            else return searchCeiling(nums, start, mid - 1, x);
        }
        else{
            if(mid + 1 <= end && nums[mid + 1] >= x)
                return mid + 1;
            else return searchCeiling(nums, mid + 1, end, x);
        }
    }
}
