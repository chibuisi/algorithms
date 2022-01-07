package leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] arr = new String[]{"flower","flow","flight"};
        String [] arr2 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        long start = System.currentTimeMillis();
        String result = longestCommonPrefix(arr);
        long end = System.currentTimeMillis();
        System.out.println("Result "+ result +" took "+(end - start)+" ms");
        System.out.println(solve(arr2));
    }
    public static String solve(String [] array){
        if(array.length == 0)
            return "";
        if(array.length == 1)
            return array[0];
        Arrays.sort(array);
        int minLen = Integer.min(array[0].length(), array[array.length-1].length());
        System.out.println(Arrays.toString(array));
        int i = 0;
        while(i < minLen){
            if(array[0].charAt(i) != array[array.length-1].charAt(i))
                break;
            else
                i++;
        }
        return array[0].substring(0, i);
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null){
            return "";
        }
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
