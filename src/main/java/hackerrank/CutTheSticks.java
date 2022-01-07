package hackerrank;

import java.util.*;

public class CutTheSticks {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++){
            int num = arr.get(i);
            if(arr.contains(0))
                arr.remove(0);
            result.add(arr.size());
            if(arr.size() > 0 && !arr.contains(num-1)){
                subtractSmallestValues(arr, num);
            }
        }

        return result;
    }

    private static List<Integer> subtractSmallestValues(List<Integer> nums, int smallest){
        for(int i = 0; i < nums.size(); i++){
            int num = nums.get(i);
            nums.set(i, num - smallest);
        }
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3);
        List<Integer> res = cutTheSticks(arr);
        System.out.println(res);
    }
}
