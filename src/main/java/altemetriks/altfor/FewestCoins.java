package altemetriks.altfor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FewestCoins {
    public static void main(String[] args) {
        //daabcddaaabc
        System.out.println(solve1("aaaaabbbcaaabc"));
    }

    public static int solve1(String input){
        String unique = removeDups(input);
        int lag = 0;
        int globalMin = input.length();
        while(lag<input.length()){
            int lead = lag+unique.length()-1;
            while(lead<=input.length()){
                if (containsAll(input.substring(lag, lead), unique)){
                    globalMin = Integer.min(globalMin, lead-lag);
                }
                lead++;
            }
            lag++;
        }
        return globalMin;
    }

    public static String removeDups(String str){
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if (result.indexOf(c+"") == -1)
                result.append(c);
        }
        return result.toString();
    }

    public static boolean containsAll(String str, String uniqueStr) {
        for (char c : uniqueStr.toCharArray()) {
            if (str.indexOf(c) == -1)
                return false;
        }
        return true;
    }
    public static int solve(String str){
        List<List<String>> permutations = new ArrayList<>();
        backtrack(permutations, new ArrayList<>(), str);
        return permutations.stream().collect(Collectors.summarizingInt(li -> li.size())).getMin();
    }
    private static void backtrack(List<List<String>> permutations, List<String> tempList, String str){
        String temp = new String(tempList.stream().collect(Collectors.joining()));
        if(containsAll(temp, str))
            permutations.add(new ArrayList<>(tempList));
        else{
            for(int i = 0; i < str.length(); i++){
                String newString = String.valueOf(str.charAt(i));
                if(tempList.contains(newString))
                    continue;
                tempList.add(newString);
                backtrack(permutations,tempList,str);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
