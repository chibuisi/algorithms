package enfec_tmobile.pair;

public class Solution {
    int capacity;
    int [] data = new int[capacity];
    int size = 0;

    public Solution(int capacity){
        this.capacity = capacity;
    }
    public Solution(){
        this.capacity = 10;
    }

    public void add(int num){
        if(size == capacity)
            resize();
        data[size++] = num;
    }
    private void resize(){
        int [] temp = new int[capacity*2];
        System.arraycopy(data, 0, temp, 0, size);
        data = temp;
    }

}