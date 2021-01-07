package flexton;

public class ModifyArrayOnceToNonDecreasing {
    public static void main(String[] args) {
        int [] nums = {4,2,3};
        System.out.println(canModify(nums));
    }
    public static boolean canModify(int [] nums){
        int flag = 0;
        for(int i = 0; i < nums.length-1; i++){

            if(nums[i] > nums[i+1])
                flag++;
            if(flag == 2)
                return false;
        }
        return true;
    }
}
