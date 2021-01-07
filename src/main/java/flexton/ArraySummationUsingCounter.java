package flexton;

import java.util.ArrayList;
import java.util.List;

public class ArraySummationUsingCounter {
    public static void main(String[] args) {
        System.out.println(summation(new int[]{1,6,8,5,9,4,7,2}));
    }
    private static List<Integer> summation(int[] arr){
        if(arr == null || arr.length==0)
            return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        //result.add(arr[0]);
        int index = 0;
        int counter = 1;
        int sum = 0;
        while(index < arr.length-1){
            for(int i = 0; i < counter && index < arr.length; i++){
                sum += arr[index++];
            }
            counter+= 1;
            result.add(sum);
            sum=0;
        }

        return result;
    }
}
