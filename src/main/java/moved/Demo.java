package moved;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<String> words=new ArrayList<String>();

        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");

        System.out.println(anagrams(words));
    }
    public static ArrayList<String> anagrams(List<String> words){
        if(words.size() == 0)
            return null;
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String s : words){
            s = s.toLowerCase();
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String newString = new String(c);

            if(anagrams.containsKey(newString)){
                anagrams.get(newString).add(s);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(s);
                anagrams.put(newString,newList);
            }
        }
        //anagrams.entrySet().stream().forEach(e -> result.add(e.getValue()));
        //result.addAll(anagrams.values());
        for(Map.Entry e : anagrams.entrySet()){
            result.add((List<String>) e.getValue());
        }
        return anagrams.entrySet().stream().flatMap(d -> d.getValue().stream()).collect(Collectors.toCollection(ArrayList<String>::new));

        //return result;
    }

}

