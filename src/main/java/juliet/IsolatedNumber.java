package juliet;

import java.util.Arrays;

public class IsolatedNumber {
    public static void main(String[] args) {
        System.out.println(isIsolated(162));
    }
    public static boolean isIsolated(long num){
        long longCube = num * num * num;
        String value = longCube+"";
        char [] charArr = value.toCharArray();


        long sqr = num * num;
        String cube = num * num * num + "";
        StringBuilder str = null;
        while(sqr > 0){
            int modValue = (int) sqr % 10;
            str = new StringBuilder(modValue);
            if(cube.contains(str))
                return false;
            sqr = sqr / 10;
        }


//        while(sqr > 0){
//            int modValue = (int) sqr % 10;
//            char c = (char) modValue;
//            if(Arrays.binarySearch(charArr,c) == 1){
//                return false;
//            }
//            sqr /= 10;
//        }
//
        return true;
    }
}
