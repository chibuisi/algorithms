package algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> obs = new ArrayList<Object>(
                Arrays.asList(5,2,Arrays.asList(7,-1),3,Arrays.asList(6,Arrays.asList(-13,8),4)));
        System.out.println(productSum(obs, 1));
    }
    public static int productSum(List<Object> array, int m){
        int sum = 0;
        for(Object ob : array){
            if(ob instanceof List){
                sum += productSum((List<Object>) ob, m + 1);
            }
            else
                sum += (Integer) ob;
        }
        return sum * m;
    }
}
