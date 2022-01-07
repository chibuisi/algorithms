package hackerrank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int left = 0;
        int result = 0;
        while(left <= s.size() - m){
            int sum = 0;
            int right = left;
            while(right < left + m){
                sum += s.get(right);
                right += 1;
            }
            if(sum == d)
                result += 1;
            left += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4);
        System.out.println(birthday(list, 4,1));
    }
}
