package algoexpert.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestDiff {
    public static void main(String[] args) {
        int [] arrayOne = {-1,5,20,28,3};
        int [] arrayTwo = {26,134,135,15,17};
        int [] res = smallestDifference(arrayOne,arrayTwo);
        System.out.println(Arrays.toString(res));
    }
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int smallestDiff = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int [] smallestDiffArr = new int[2];
        List<List<Integer>> perms = new ArrayList<List<Integer>>();
        while(i < arrayOne.length && j < arrayTwo.length){
            int diff = Math.abs(arrayOne[i] - arrayTwo[j]);
            if(diff < smallestDiff){
                smallestDiff = diff;
                smallestDiffArr[0] = arrayOne[i];
                smallestDiffArr[1] = arrayTwo[j];
            }
            if(arrayOne[i] < arrayTwo[j]){
                i++;
            }
            else if(arrayOne[i] > arrayTwo[j]){
                j++;
            }
            else{
                smallestDiffArr[0] = arrayOne[i];
                smallestDiffArr[1] = arrayTwo[j];
                return smallestDiffArr;
            }

        }
        return smallestDiffArr;
    }
}
