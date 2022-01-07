package codility;

import java.util.HashMap;
import java.util.Map;

public class MissingInteger {
    public static void main(String[] args) {

    }
    public static int solutionOne(int [] array){
        Map<Integer,Integer> count = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            int curr = array[i];
            if(count.containsKey(curr)){

            }
            else{
                count.put(curr, count.get(curr)+1);
            }
        }
        int numbers = 1;
        for(Map.Entry e : count.entrySet()){
            //if(e.getKey() )
        }
        return 0;
    }
}
