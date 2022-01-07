package dailychallenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

//Given a string of words, return the length of the shortest word in the string.
public class ShortestWord {
    public static void main(String[] args) {
        String sentence = "let talk about us javascript";
        int count = shortestWord(sentence);
        System.out.println(count);
        System.out.println(shortestWordLength(sentence));
    }
    public static int shortestWordLength(String sentence){
        int min = Stream.of(sentence.split(" ")).map(s -> s.length()).min(Comparator.comparing(Integer::intValue)).get();
        return min;
    }
    public static int shortestWord(String sentence){
        String [] words = sentence.split(" ");
        int count = shortestWord(words, 0, words.length-1);
        return count;
    }
    private static int shortestWord(String[] words, int start, int end){
        if(start>=end)
            return words[start].length();
        int max = Math.min(words[start].length(),words[end].length());
        int mid = (start+end) / 2;
        int leftMinCount = Math.min(max,shortestWord(words,start,mid));
        int rightMinCount = shortestWord(words,mid+1,end);
        return Math.min(leftMinCount,rightMinCount);
    }
}
