package cvs;

import java.util.Arrays;

//this class is a custom array list for strings
public class ArrayList {
    private int capacity;
    private String [] strings;
    private int size;

    public ArrayList(){
        capacity = 10;
        strings = new String[capacity];
    }

    public ArrayList(int capacity){
        this.capacity = capacity;
        strings = new String[capacity];
    }

    public void add(String str){
        int idx = indexOf(str);
        if(idx > -1)
            return;
        if(size == capacity)
            resize();
        strings[size++] = str;
    }

    public void add(int index, String str){
        if(index < capacity) {
            strings[index] = str;
            size++;
        }
        else
            strings[size++] = str;
    }

    public String get(int index) throws ArrayIndexOutOfBoundsException{
        if(index < capacity)
            return strings[index];
        throw new ArrayIndexOutOfBoundsException("Index out of bounds");
    }

    public int indexOf(String str){
        for(int i = 0; i < strings.length; i++){
            if(strings[i] == str)
                return i;
        }
//        Arrays.sort(strings);
//        int res = Arrays.binarySearch(strings, str);
        return -1;
    }

    public boolean contains(String str){
        if(indexOf(str) > -1)
            return true;
        return false;
    }

    public boolean remove(int index){
        if(index < capacity) {
            strings[index] = null;
            size--;
            return true;
        }
        return false;
    }

    public void remove(String str){
        int idx = indexOf(str);
        if(idx > -1){
            while (idx < size && strings[idx+1] != null){
                if(idx < size){
                    strings[idx] = strings[idx+1];
                }
                idx+=1;
            }
            strings[idx] = null;
            size--;
        }
    }

    public void resize(){
        capacity *= 2;
        String [] temp = new String[capacity];
        System.arraycopy(strings, 0, temp, 0, strings.length-1);
        strings = temp;
    }

    public int size(){
        return size;
    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < strings.length; i++){
            if(strings[i] != null) {
                System.out.print(strings[i]);
                if (i < strings.length-1 && strings[i+1] != null)
                    System.out.print(", ");
            }
            if(i < strings.length-1 && strings[i+1] == null)
                break;
        }
        System.out.print("]");
        //System.out.println(Arrays.toString(strings));
    }
}
