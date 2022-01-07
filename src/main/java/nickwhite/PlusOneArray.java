package nickwhite;

import java.util.Arrays;

public class PlusOneArray {
    public static int [] solve(int [] array){
        for(int i = array.length-1; i>=0; i++){
            if(array[i] < 9){
                array[i]++;
                return array;
            }
            array[i] = 0;
        }
        int [] result = new int[array.length+1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{1,2,3, 9})));
    }
}
//
//
//[1,3,6]
//
//1 * 10 = 10 + 3 = 13