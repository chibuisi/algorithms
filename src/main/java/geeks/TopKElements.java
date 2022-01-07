package geeks;

import java.util.*;

public class TopKElements {
    public static int[] solve(int [] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
                map.put(nums[i], 1);
        }
        System.out.println(map);
        //[1,2],[2,2],[3,3],[4,1]
        int [] res = new int[k];
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() == o2.getValue())
                    return o2.getKey() - o1.getKey();
                else return o2.getValue() - o1.getValue();
            }
        });
        for(int i = 0; i < k; i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,3,4};
        int [] arr2 = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(solve(arr, 2)));
    }
}
