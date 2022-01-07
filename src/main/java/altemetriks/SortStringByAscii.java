package altemetriks;

import java.util.Arrays;

public class SortStringByAscii {
    public static void main(String[] args) {
        System.out.println(solutionTwo("cbaD"));
    }
    public static String solve(String str){
        char [] strings = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int [] asc = new int[strings.length];
        for(int i = 0; i < strings.length; i++){
            int ch = strings[i];
            asc[i] = ch;
        }
        System.out.println(Arrays.toString(asc));
        Arrays.sort(asc);
        for(int i = 0; i < asc.length; i++){
            char c = (char) (asc[i]);
            result.append(c);
        }
        return result.toString();
    }
    public static String solutionTwo(String str){
        StringBuilder result = new StringBuilder();
        int [] asc = new int[str.length()];
        for(int i = 0; i < asc.length; i++){
            asc[i] = (int) str.charAt(i);
        }
        Arrays.sort(asc);
        for (int j : asc) {
            result.append((char) j);
        }
        return result.toString();
    }
}
