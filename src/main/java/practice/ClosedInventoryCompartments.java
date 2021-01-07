package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ClosedInventoryCompartments {
    public static void main(String[] args) {
        String s = "|**|*|*";
        List<Integer> start = Arrays.asList(1,1);
        List<Integer> end = Arrays.asList(5,6);
        List<Integer> res = inventory(s, start,end);
        System.out.println(res);
    }
    public static List<Integer> inventory(String str, List<Integer> startIngindices, List<Integer> endIndices){
        if(str.length() == 0 || str == null)
            return null;
        List<Integer> inventoryList = new ArrayList<>();
        for(int i = 0; i < startIngindices.size(); i++){
            String substring = str.substring(startIngindices.get(i)-1, endIndices.get(i));
            int firstIndex = substring.indexOf("|");
            int lastIndex = substring.lastIndexOf("|");
            char [] c = substring.toCharArray();
            int count = 0;
            for(int j = firstIndex; j < lastIndex; j++){
                if(c[j] == '*'){
                    count++;
                }
            }
            inventoryList.add(count);
        }
        return inventoryList;
    }
}
