package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakinTheRecords {
    public static List<Integer> solve(List<Integer> scores){
        List<Integer> result = new ArrayList<>();
        result.add(0,0);
        result.add(1,0);
        int max = scores.get(0), min = scores.get(0);
        for(int i = 1; i < scores.size(); i++){
            int curr = scores.get(i);
            if(curr < min)
                result.set(0,result.get(0)+1);
            if(curr > max)
                result.set(1, result.get(1)+1);
            max = Integer.max(max, curr);
            min = Integer.min(min, curr);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
        System.out.println(solve(list));
    }
}
