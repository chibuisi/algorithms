package dailybyte;

import java.util.LinkedList;
import java.util.Queue;

public class CallCounter {
    private Queue<Integer> queue;

    public CallCounter(){
        queue = new LinkedList<>();
    }

    public int ping(int timeInMilliSeconds){
        queue.add(timeInMilliSeconds);
        while(!queue.isEmpty() && queue.peek() > timeInMilliSeconds - 3000){
            queue.remove();
        }
        return queue.size();
    }
}
