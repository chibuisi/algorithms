package altemetriks.riot;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {3,1,3,3,2};
        System.out.println(solutionOne(arr));
    }
    public static int solutionOne(int [] array){
        int majority = -1;
        int largest = 1;
        Map<Integer, Integer> items = new HashMap<>();
        for(int i : array){
            if(items.containsKey(i)){
                items.put(i, items.get(i)+1);
            }
            else{
                items.put(i,1);
            }
            if(items.get(i) > largest){
                largest = items.get(i);
                if(items.get(i) >= (array.length/2))
                    majority = items.get(i);
            }
        }
        return majority;
    }
}
