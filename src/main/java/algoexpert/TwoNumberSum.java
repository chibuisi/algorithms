package algoexpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int [] arr = {3,5,-4,8,11,1,-1,6};
        int [] res = twoNumberSum2(arr,10);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Map<Integer,Integer> intMap = new HashMap<>();
        for(int i=0; i < array.length; i++){
            int diff = targetSum - array[i];
            if(!intMap.containsKey(diff)){
                intMap.put(array[i],array[i]);
            }
            else{
                int [] arr = {diff,array[i]};
                return arr;
            }
        }
        return new int[0];
    }

    //This solution requires that array is sorted
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        // Write your code here.
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int sum = array[left] + array[right];
            if(sum == targetSum){
                return new int[]{array[left],array[right]};
            }
            else if(sum < targetSum){
                left+=1;
            }
            else{
                right+=1;
            }
        }
        return new int[0];
    }
}
