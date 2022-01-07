package nickwhite;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static int solve(int [] array){
        int left = 0;
        int right = array.length-1;
        int max = Integer.MIN_VALUE;
        while (left < right){
            if(array[left] < array[right]){
                max = Integer.max(max, array[left] * right - left);
                left++;
            }else{
                max = Integer.max(max, array[right] * right - left);
                right--;
            }
        }
        return max;
    }
    /*Input: height =  [4,3,2,1,4]
    Output: 16*/

    public static void main(String[] args) {
        int [] arr = {4,3,2,1,4};
        System.out.println(solve(arr));
    }
}
