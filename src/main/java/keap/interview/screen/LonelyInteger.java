package keap.interview.screen;

import java.util.HashMap;
import java.util.Map;

public class LonelyInteger {
    public static int solve3(int [] arr){
        int x = 0;
        for(int i : arr){
            x = x ^ i;
        }
        return x;
    }

    public static int solve2(int [] arr){
        Map<Integer,Integer> counts = new HashMap<>();
        for(int i : arr){
            counts.put(i, counts.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : counts.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }

    public static int solve(int [] arr){
        int result = arr[0];
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = 0; j < arr.length; j++){
                if(i == j)
                    continue;
                if(arr[i] == arr[j])
                    count++;
            }
            if(count == 1)
                result = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = {4,1,1,2,3,2,4,3,5};
        System.out.println(solve(arr));
        //System.out.println(solve2(arr));
        //System.out.println(solve3(arr));
    }
}
