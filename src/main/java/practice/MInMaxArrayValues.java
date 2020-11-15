package practice;

import java.util.Arrays;

public class MInMaxArrayValues {
    public static void main(String[] args) {
        int []array = {2,3,42,3,4455,4,5,7};
        int [] res = getMinAndMaxFrom2(array);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getMinAndMaxFrom(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            min = array[i] < min ? array[i] : min;
            max = array[i] > max ? array[i] : max;
        }
        return new int[]{min, max};
    }

    public static int[] getMinAndMaxFrom2(int[] array) {
        Arrays.sort(array);
        return new int[]{array[0],array[array.length-1]};
    }
}
