package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Staircase {
    public static void solve(int n) {
        // Write your code here
        int print = n;

        while(print > 0){
            StringBuilder curr = new StringBuilder();
            int spaces = print-1;
            if(spaces > 0){
                while(spaces > 0){
                    curr.append(" ");
                    spaces--;
                }
            }
            while(curr.length() < n){
                curr.append("#");
            }
            System.out.println(curr.toString());
            print-=1;
        }
    }

    public static void main(String[] args) {
        solve(5);
        Map<Integer, Integer> map = new HashMap<>();
        map.get(0);
    }
}
