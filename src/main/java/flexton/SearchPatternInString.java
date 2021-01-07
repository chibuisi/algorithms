package flexton;

import java.util.ArrayList;
import java.util.List;

public class SearchPatternInString {
    public static void main(String[] args) {
        String text = "AAAAABAAABA";
        String pattern = "AAAA";
        System.out.println(search(text,pattern));
    }
    public static List<Integer> search(String text, String pattern){
        List<Integer> indexes = new ArrayList<>();
        int indexText = 0;
        int indexPattern = 0;
        int [] lps = new int[pattern.length()];
        populateLPS(lps,pattern);
        while(indexText < text.length()-1){
            if(indexPattern < pattern.length() &&   text.charAt(indexText) == pattern.charAt(indexPattern)){
                indexText++;
                indexPattern++;
            }
            if(indexPattern == pattern.length()){
                indexes.add(indexText - indexPattern);
                indexPattern = lps[indexPattern - 1];
            }
            else if(indexText < text.length() && text.charAt(indexText) != pattern.charAt(indexPattern)){
                if(indexPattern != 0)
                    indexPattern = lps[indexPattern - 1];
                else
                    indexText++;
            }
        }
        return indexes;
    }

    private static void populateLPS(int[] lps, String pattern) {
        int prevLen = 0;
        int indexPattern = 0;
        lps[0] = 0;

        while (indexPattern < pattern.length()){
            if(pattern.charAt(indexPattern) == pattern.charAt(prevLen)){
                prevLen++;
                lps[indexPattern] = prevLen;
                indexPattern++;
            }
            else{
                if(prevLen != 0)
                    prevLen = lps[prevLen - 1];
                else{
                    lps[indexPattern] = prevLen;
                    indexPattern++;
                }
            }
        }
    }
}
