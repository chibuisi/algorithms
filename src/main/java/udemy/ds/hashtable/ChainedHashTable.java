package udemy.ds.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable(){
        hashTable = new LinkedList[10];
        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoredEmployee(key,employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> listIterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        while(listIterator.hasNext()){
            storedEmployee = listIterator.next();
            if(storedEmployee.getKey().equals(key)){
                return storedEmployee.getEmployee();
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        Employee employee = null;
        ListIterator<StoredEmployee> iterator = hashTable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while(iterator.hasNext()){
            index++;
            storedEmployee = iterator.next();

            if(storedEmployee.getKey().equals(key)){
                employee = storedEmployee.getEmployee();
                iterator.remove();
                break;
            }

        }
        if(employee == null)
            return null;
        //hashTable[hashedKey].remove(index);
        return employee;
    }

    private int hashKey(String key){
        return Math.abs(key.hashCode() % hashTable.length);
        //return hashTable.length % key.length();
    }

    public void printHashTable(){
        for(int i = 0; i < hashTable.length; i++){
            if(hashTable[i].size() > 0){
                ListIterator<StoredEmployee> iterator = hashTable[i].listIterator();
                while(iterator.hasNext()){
                    System.out.print(iterator.next().getEmployee()+ "=> ");
                }
                System.out.println();
            }
        }
    }
}
