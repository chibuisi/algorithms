package udemy.ds.hashtable;

import java.util.Arrays;

public class HashFunction {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
        for(int i = 0; i < numsToAdd.length; i++){
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static int hash(int value){
        return value % 10;
    }
}
