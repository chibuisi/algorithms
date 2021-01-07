package enfec_tmobile.pair;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    List<Integer> data = new ArrayList<>();
    int size = 0;
    int index = 0;

    public void add(int num){
        data.set(index++, num);
        size++;
    }

    public int get(int index){
        if(index <= size)
            return data.get(index);
        return -1;
    }
    public boolean contains(int num){
        return data.contains(num);
    }
    public void remove(int num){
        if(contains(num)) {
            int idx = data.indexOf(num);
            data.remove(idx);
            size--;
        }
    }

    public void removeAtIndex(int index){
        if(index <= size)
            data.remove(index);
    }
}
