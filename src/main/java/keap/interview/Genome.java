package keap.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Genome {
    public static List<Integer> solution1(String genome, String fragment){
        Map<String, List<Integer>> fragPositions = new HashMap<>();
        for(int i = 0; i < genome.length(); i++){
            String curr = "";
            if(i < genome.length() - 2)
                curr = genome.substring(i,i+3);
            if(fragPositions.containsKey(curr)){
                fragPositions.get(curr).add(i);
            }
            else{
                List<Integer> newList = new ArrayList<>();
                newList.add(i);
                fragPositions.put(curr, newList);
            }
        }
        return fragPositions.get(fragment);
    }

    public static List<Integer> solution2(String genome, String fragment){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < genome.length(); i++){
            String curr = "";
            if(i < genome.length() - 2)
                curr = genome.substring(i, i+3);
            if(curr.equals(fragment))
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String genome = "ATGCCHEOJRJRATG";
        String fragment = "ATG";
        System.out.println(solution1(genome,fragment));
        System.out.println(solution2(genome,fragment));
    }
}
