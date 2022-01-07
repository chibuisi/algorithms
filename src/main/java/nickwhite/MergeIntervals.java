package nickwhite;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static int[][] solve(int [][] intervals){
        List<int[]> merged = new ArrayList<>();
        int [] currentInterval = intervals[0];
        merged.add(currentInterval);

        for(int[] interval : intervals){
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(nextBegin > currentEnd){
                currentInterval[1] = Integer.max(currentEnd, nextEnd);
            }
            else{
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
