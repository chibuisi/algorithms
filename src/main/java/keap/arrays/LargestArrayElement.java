package keap.arrays;

public class LargestArrayElement {

    public static int solution1(int [] nums){
        if(nums == null || nums.length == 0)
            return -1;
        int largest = nums[0];
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(largest < curr)
                largest = curr;
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(solution1(new int[]{2,3,4,1}));
    }
}
