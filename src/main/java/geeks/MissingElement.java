package geeks;

public class  MissingElement {
    public static void main(String[] args) {
        int [] nums = {12456};
        System.out.println(findMissingElement(nums));
        System.out.println(findMissingElementOptimized(nums));
    }
    public static int findMissingElement(int [] nums){
        //using total = n(n+1)/2 == ((n+1)(n+2))/2
        int total = ((nums.length + 1) * (nums.length + 2)) / 2;
        for(int i = 0 ; i < nums.length-1; i++){
            total -= nums[i];
        }
        return total;
    }
    public static int findMissingElementOptimized(int [] nums){
        int x1 = nums[0]; //all element in array
        int x2 = 1; //all from from 1 to n+1

        for(int i = 1; i < nums.length; i++){
            x1 ^= nums[i];
        }
        for(int i = 2; i <= nums.length+1; i++){
            x2 ^= i;
        }
        return x1 ^ x2;
    }
}
