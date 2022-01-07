package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static List<Integer> solve(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(Integer grade : grades){
            if(grade < 38){
                result.add(grade);
            }
            else{
                int nextMultiple5 = grade+1;
                while(nextMultiple5 % 5 != 0)
                    nextMultiple5++;
                int diff  = nextMultiple5 - grade;
                if(diff < 3)
                    result.add(nextMultiple5);
                else
                    result.add(grade);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(73, 67, 38, 33));
        System.out.println(solve(list));
    }
}
