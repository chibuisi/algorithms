package practice;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("face", "caffe", "cafe", "milk", "limk", "abc");

        extractAnagrams(wordList);
    }

    public static void extractAnagrams(List<String> wordList){
        Map<String, List<String>> map = new HashMap<>();
        wordList.forEach(word -> map.put(anagramize(word), listWords(word, map) ));
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("key : " + entry.getKey() + " word : " + entry.getValue());
        }
        System.out.println("Anagrams from list: " + wordList);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if(entry.getValue().size() > 1) {
                System.out.println(entry.getValue());
            }
        }
    }
    public static String anagramize(String word){
        List<String> listWord = new ArrayList<>(Arrays.asList(word.split("")));
        Collections.sort(listWord);
        return String.join("", listWord);
    }
    public static List<String> listWords(String word, Map<String,List<String>>  map){
        List<String> arrayList = map.getOrDefault(anagramize(word), new ArrayList<>(Arrays.asList()));
        arrayList.add(word);
        return arrayList;
    }
}
