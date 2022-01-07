package dailychallenge;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> solve(int [][] nums){
        List<Integer> res = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = nums.length-1;
        int columnBegin = 0;
        int columnEnd = nums[0].length-1;

        while(rowBegin <= rowEnd && columnBegin <= columnEnd){
            for(int i = columnBegin; i <= columnEnd; i++){
                res.add(nums[rowBegin][i]);
            }
            rowBegin+=1;
            for(int i = rowBegin; i <= rowEnd; i++){
                res.add(nums[i][columnEnd]);
            }
            columnEnd-=1;
            if(rowBegin <= rowEnd){
                for(int i = columnEnd; i >= columnBegin; i--){
                    res.add(nums[rowEnd][i]);
                }
                rowEnd-=1;
            }
            if(columnBegin <= columnEnd){
                for(int i = rowEnd; i >= rowBegin; i--){
                    res.add(nums[i][columnBegin]);
                }
                columnBegin+=1;
            }
        }

        return res;
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
