package nickwhite.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static List<Integer> solve(int [][] nums){
        List<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) return result;

        int rowBegin = 0, rowEnd = nums.length - 1;
        int colBegin = 0, colEnd = nums[0].length - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++){
                result.add(nums[rowBegin][i]);
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++){
                result.add(nums[i][colEnd]);
            }
            colEnd--;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    result.add(nums[rowEnd][i]);
                }
                rowEnd--;
            }
            if(rowBegin <= rowBegin){
                for(int i = rowEnd; i >= rowBegin; i--){
                    result.add(nums[i][colBegin]);
                }
                colBegin++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(solve(arr));
    }
}
