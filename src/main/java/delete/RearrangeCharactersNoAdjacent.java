package delete;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrangeCharactersNoAdjacent {
    public static void main(String[] args) {
        System.out.println(rearrange("aaabc"));
    }
    public static String rearrange(String str){
        int [] counts = new int[26];
        for(char c : str.toCharArray()){
            counts[c - 'a']++;
        }
        PriorityQueue<Key> queue = new PriorityQueue<>(new KeyComparator());
        for(char c = 'a'; c < 'z'; c++){
            int val = counts[c - 'a'];
            if(val > 0)
                queue.add(new Key(c, val));
        }
        String result = "";
        Key prev = new Key('#', -1);
        while(!queue.isEmpty()){
            Key key = queue.poll();
            result += key.character;
            if(prev.frequency > 0)
                queue.add(prev);
            prev = key;
            prev.frequency--;
        }
        return result.length() == str.length() ? result : "Not Possible";
    }
}
class Key{
    char character;
    int frequency;

    public Key(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
    }
}

class KeyComparator implements Comparator<Key>{

    @Override
    public int compare(Key k1, Key k2) {
        if(k1.frequency < k2.frequency)
            return 1;
        else if(k1.frequency > k2.frequency)
            return -1;
        else
            return 0;
    }
}
