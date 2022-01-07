package hackerrank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void solve(List<Integer> nums) {
        // Write your code here
        int n = nums.size();
        int pos = 0;
        int neg = 0;
        int zero = 0;

        int index = 0;
        while(index < nums.size()){
            int currVal = nums.get(index++);
            if(currVal == 0)
                zero++;
            else if(currVal > 0)
                pos++;
            else
                neg++;
        }
        double posRes = (double) pos/n;
        //posRes = Math.round(posRes * 1000000d) / 1000000d;
        double negRes = (double) neg/n;
        //negRes = Math.round(negRes * 1000000d) / 1000000d;
        double zeroRes = (double) zero/n;
        //zeroRes = Math.round(zeroRes * 1000000d) / 1000000d;
        System.out.println(posRes);
        System.out.println(negRes);
        System.out.println(zeroRes);
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,0,-1,-1);
        solve(nums);
        StringBuilder curr = new StringBuilder();

    }

}
