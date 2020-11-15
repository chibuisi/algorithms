package geeks;

public class OddOccuringElement {
    public static void main(String[] args) {
        int [] nums = {1,1,2,2,2,3,3};
        System.out.println(findOddOccuringElement(nums));
    }
    public static int findOddOccuringElement(int [] nums){
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
}
