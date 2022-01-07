package flexton;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ReaarrangeStringNoAdjCharacter {
    public static void main(String[] args) {
        System.out.println(rearrange("aaabc"));
    }
    public static String rearrange(String str){
        //build a count frequency array
        int [] counts = new int[26];
        for(int i = 0; i < str.length(); i++){
            counts[str.charAt(i) - 'a']++;
        }

        //build a priority queue
        PriorityQueue<Key> queue = new PriorityQueue<>(new KeyComparator());
        for(char c = 'a'; c < 'z'; c++){
            int count = counts[c - 'a'];
            if(count > 0)
                queue.add(new Key(count,c));
        }

        String result = "";
        Key prev = new Key(-1, '#');
        while(!queue.isEmpty()){
            Key key = queue.poll();
            result = result+key.character;

            if(prev.frequency > 0)
                queue.add(prev);

            key.frequency--;
            prev = key;
        }
        if(result.length() == str.length())
            return result;
        return "Not possible";
    }
}
class Key{
    int frequency;
    char character;

    public Key(int frequency, char character) {
        this.frequency = frequency;
        this.character = character;
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
