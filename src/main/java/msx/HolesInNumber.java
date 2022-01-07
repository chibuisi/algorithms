package msx;

import java.util.HashMap;
import java.util.Map;

public class HolesInNumber {
    public static void main(String[] args) {
        System.out.println(holesinNumber(1028));
    }
    public static int holesinNumber(int num){

        Map<Integer, Integer> holes = new HashMap<>();
        holes.put(1,0);
        holes.put(2,0);
        holes.put(2,0);
        holes.put(5,0);
        holes.put(7,0);
        holes.put(0,1);
        holes.put(4,1);
        holes.put(6,1);
        holes.put(9,1);
        holes.put(8,2);
        int result = 0;
        int temp = 0;
        while(num >= 1){
            temp = num % 10;
            result += holes.get(temp);
            num /= 10;
        }
        return result;
    }
}
