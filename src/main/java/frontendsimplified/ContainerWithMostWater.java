package frontendsimplified;

public class ContainerWithMostWater {
    public static int solve(int [] arr){
        int left = 0;
        int right = arr.length - 1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            if(arr[left] < arr[right]){
                max = Integer.max(max, arr[left] * (right - left));
                left++;
            }
            else {
                max = Integer.max(max, arr[right] * (right - left));
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
