package dailybyte2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static int[] solve(int [] nums){
        int [] result = new int[nums.length];
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> {
            if(o1[1] == o2[1])
                return o2[0] - o1[0];
            else
                return o1[1] - o2[1];
        });
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            int [] temp = {entry.getKey(), entry.getValue()};
            queue.add(temp);
        }
        int index = 0;
        while(!queue.isEmpty()){
            int [] temp = queue.poll();
            for(int i = 0; i < temp[1]; i++){
                result[index++] = temp[0];
            }
        }
        return result;
    }
    //solution
    //fill the map
    //use the map to fill the queue
    //use the queue to fill the result array

    public static void main(String[] args) {
        int [] arr = {1,1,2,3};
        //nums = [5, 2, 4, 4, 9, 2, 2], return [9,5,4,4,2,2,2].
        int [] arr2 = {5,2,4,4,9,2,2};
        System.out.println(Arrays.toString(solve(arr2)));
        System.out.println(Arrays.toString(solve(arr)));
    }
}
