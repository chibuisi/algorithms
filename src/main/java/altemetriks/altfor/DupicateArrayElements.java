package altemetriks.altfor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DupicateArrayElements {
    private UUID uuid;
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(duplicate(list));
    }
    public List<Integer> duplicateElements(List<Integer> items){
        int j = items.size() - 1;
        Integer element;
        items.addAll(items);
        for(int i = items.size()-1;i>-1;i-=2,j--) {
            element = items.get(j);
            items.set(i, element);
            items.set(i-1, element);
        }
        return items;
    }

    public static List<Integer> duplicate(List<Integer> items){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < items.size(); i++){
            result.add(items.get(i));
            result.add(items.get(i));
        }
        return result;
    }
}
