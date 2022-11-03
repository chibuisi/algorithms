package nickwhite;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static int solve(int [] array){
        int left = 0;
        int right = array.length-1;
        int max = Integer.MIN_VALUE;
        while (left < right){
            if(array[left] > array[right]){
                max = Integer.max(max, array[left] * right - left);
                right--;
            }else{
                max = Integer.max(max, array[right] * right - left);
                left++;
            }
        }
        return max;
    }
    /*Input: height =  [1,8,6,2,5,4,8,3,7]
    Output: 49*/

    public static void main(String[] args) {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(solve(arr));
    }
}
