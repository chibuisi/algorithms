package nickwhite.subsequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubArray {
    public static int solve(int [] nums){
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        int maxLength = 0, seqLength = 0;
        for(int num : nums){
            seqLength = 1;
            if(!numsSet.contains(num-1)){
                while(numsSet.contains(num+1)){
                    num += 1;
                    seqLength += 1;
                }
                maxLength = Math.max(maxLength, seqLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{100,4,200,1,3,2}));
    }
}
