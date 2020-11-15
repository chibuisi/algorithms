package algoexpert.medium;

public class LongestPeak {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        System.out.println(longestPeak(arr));
    }
    public static int longestPeak(int[] array) {
        // Write your code here.
        int longestPeak = 0;
        int i = 1;
        while(i < array.length - 1){
            if(array[i - 1] < array[i] && array[i] > array[i+1]){
                int lc = -2;
                int leftIdx = i - 2;
                int rightIdx = i + 2;
                int rc = 2;
                int pos = i;
                while(pos > 0 && array[pos] > array[pos-1]){
                    lc++;
                    leftIdx--;
                    pos--;
                }
                pos = i;
                while(pos < array.length - 1 && array[pos] > array[pos+1]){
                    rc++;
                    rightIdx++;
                    pos++;
                }
                //longestPeak = Math.max(lc,rc);
                int currPeak = rightIdx - leftIdx - 1;
                longestPeak = Math.max(currPeak, longestPeak);
            }
            i++;
        }
        return longestPeak;
    }
}
