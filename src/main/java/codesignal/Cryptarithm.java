package codesignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cryptarithm {
    public static boolean solution(String[] crypt, char[][] solution) {
        Map<Character, Character> map = new HashMap<>();
        Arrays.stream(solution).forEach(arr -> map.put(arr[0], arr[1]));

        StringBuilder word1 = new StringBuilder();
        StringBuilder word2 = new StringBuilder();
        StringBuilder word3 = new StringBuilder();

        Arrays.stream(crypt[0].split("")).forEach(s -> word1.append(map.get(s.charAt(0))));
        Arrays.stream(crypt[1].split("")).forEach(s -> word2.append(map.get(s.charAt(0))));
        Arrays.stream(crypt[2].split("")).forEach(s -> word3.append(map.get(s.charAt(0))));



        int sum1 = Integer.valueOf(word1.toString());
        int sum2 = Integer.valueOf(word2.toString());
        int sum3 = Integer.valueOf(word3.toString());

        if(word1.toString().equals(word2.toString()) && word1.toString().equals(word3.toString()) && word2.toString().equals(word3.toString()) && sum1 + sum2 == sum3)
            return true;

        if((word1.toString().startsWith("0") || word2.toString().startsWith("0") || word3.toString().startsWith("0")) && word1.length() != 1)
            return false;

        return sum1 + sum2 == sum3;
    }

    public static void main(String[] args) {
        String[] crypt = new String[]{"SEND", "MORE", "MONEY"};
        char [][] solution = {
                {'O', '0'},
                {'M', '1'},
                {'Y', '2'},
                {'E', '5'},
                {'N', '6'},
                {'D', '7'},
                {'R', '8'},
                {'S', '9'}};
        System.out.println(solution(crypt,solution));
        System.out.println();
    }
}
