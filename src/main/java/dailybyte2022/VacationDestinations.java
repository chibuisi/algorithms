package dailybyte2022;

import java.util.*;

public class VacationDestinations {
    public static String solve(List<String[]> flights){
        Map<String, Integer> map = new HashMap<>();
        for(String[] arr : flights){
            map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
        }
        for(String[] arr : flights){
            if(!map.containsKey(arr[1]))
                return arr[1];
        }
        return "";
    }

    public static String solve2(List<String[]> flights){
        Set<String> set = new HashSet<>();
        for(String[] arr : flights){
            set.add(arr[0]);
        }
        for(String[] arr : flights){
            if(!set.contains(arr[1]))
                return arr[1];
        }
        return "";
    }
    public static void main(String[] args) {
        List<String[]> arr = Arrays.asList(new String[]{"A", "B"}, new String[]{"B", "C"});
        System.out.println(solve2(arr));
    }
}
