package geeks;

import java.util.ArrayList;
import java.util.List;

public class SumOfConsecutives {
    public static int solve(int n){
        List<List<Integer>> combinations = new ArrayList<>();
        backtrack(combinations, new ArrayList<>(), n, 0, n);
        return combinations.size();
    }

    private static void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int n, int start, int remainder) {
        if(remainder < 0)
            return;
        if(remainder == 0)
            combinations.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < n; i++){
                tempList.add(i);
                backtrack(combinations, tempList, n, i, remainder - i);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solve(10));
    }
}
