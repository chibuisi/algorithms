package geeks;

import java.util.Arrays;

public class Sort012Array {
    public static void solve(int[]arr){
        if(arr == null || arr.length == 1)
            return;
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            if(num == 0) c0++;
            if(num == 1) c1++;
            if(num == 2) c2++;
        }
        int index = 0;
        while(index < arr.length){
            while(c0 > 0) {
                arr[index++] = 0;
                c0--;
            }
            while(c1 > 0) {
                arr[index++] = 1;
                c1--;
            }
            while(c2 > 0) {
                arr[index++] = 2;
                c2--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,2,1,1,2,1,0,0,2,0,1,0,2,1};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }
}
