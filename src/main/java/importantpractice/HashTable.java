package importantpractice;


import java.util.LinkedList;
import java.util.ListIterator;

public class HashTable {
    private LinkedList<StoredObject>[] array;

    public HashTable(){
        array = new LinkedList[10];
        for(int i = 0; i < array.length; i++)
            array[i] = new LinkedList<>();
    }

    private int hashKey(String key){
        return Math.abs(key.hashCode()) % array.length;
    }

    public void put(String key, Integer value){
        int hashedKey = hashKey(key);
            StoredObject object = new StoredObject(key,value);
            array[hashedKey].add(object);
    }

    public Integer get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredObject> iterator = array[hashedKey].listIterator();
        StoredObject object = null;
        while(iterator.hasNext()){
            object = iterator.next();
            if(object.getKey().equals(key))
                return object.getValue();
        }
        return null;
    }

    public Integer remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredObject> iterator = array[hashedKey].listIterator();
        StoredObject object = null;
        while(iterator.hasNext()){
            object = iterator.next();
            if(object.getKey().equals(key))
                break;
        }
        if(object == null)
            return null;
        else{
            array[hashedKey].remove(object);
            return object.getValue();
        }
    }

    public void print(){
        for(int i = 0; i < array.length; i++){
            if(array[i].isEmpty())
                continue;
            ListIterator<StoredObject> iterator = array[i].listIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put("Wilson", 5);
        table.put("Jane", 20);
        table.remove("Wilson");
        table.print();
    }
}
