package leetcode.easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] arr = new String[]{"flower","flow","flight"};
        long start = System.currentTimeMillis();
        String result = longestCommonPrefix(arr);
        long end = System.currentTimeMillis();
        System.out.println("Result "+ result +" took "+(end - start)+" ms");
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
