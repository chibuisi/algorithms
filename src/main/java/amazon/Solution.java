package amazon;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

    }
    static int arraySum(List<Integer> num){
        //Collections.sort(num);
        IntSummaryStatistics summary = num.stream().collect(Collectors.summarizingInt(n -> n.intValue()));
        return (int) summary.getSum();
    }
}
