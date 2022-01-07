package nickwhite;

public class MonotonicArray {
    public static boolean solve(int [] nums){
        int index = 1;
        while(index < nums.length-1){
            if((nums[index-1] > nums[index] && nums[index] < nums[index+1])
            || (nums[index-1] < nums[index] && nums[index] > nums[index+1]))
                return false;
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3};
        int [] arr2 = {6,5,4,4};
        int [] arr3 = {1,3,2};
        int [] arr4 = {1,2,4,5};
        System.out.println(solve(arr));
        System.out.println(solve(arr2));
        System.out.println(solve(arr3));
        System.out.println(solve(arr4));
    }
}
