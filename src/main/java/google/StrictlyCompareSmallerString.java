package google;

import java.util.Arrays;

public class StrictlyCompareSmallerString {
    public static void main(String[] args) {
        String one = "abcd,aabc,bd";
        String two = "aaa,aa";
        int res = compareString(one, two);
    }
    public static int compareString(String A, String B){
        int count = 0;
        int [] arr = new int[10];
        String [] first = A.split(",");
        String [] second = B.split(",");
        for(int i=0; i < second.length; i++){
            int sum = 0;
            for(int j = 0; j < first.length; j++){
                sum += compareSmaller(first[j],second[i]);
            }
            arr [count] = sum;
            count++;
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    private static int compareSmaller(String s, String s1) {
        int minX = smallest(s);

        int minY = smallest(s1);

        return minX < minY ? 1 : 0;
    }
    private static int smallest(String str){
        int [] store = new int[26];
        int min = 0;
        for (char c : str.toCharArray()){
            store[c-'a']++;
            if(c-'a' > min && store[0]==0){
                min = c-'a';
            }
            if(c-'a' < min) {
                min = c - 'a';
            }
        }
        return store[min];
    }
}
