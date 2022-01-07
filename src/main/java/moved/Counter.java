package moved;

import org.apache.commons.lang3.StringUtils;

public class Counter {
    private int count = 0;

    public int increment(){
        return ++count;
    }

    public int decrement(){
        return --count;
    }
}
