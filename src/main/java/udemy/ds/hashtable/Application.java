package udemy.ds.hashtable;

public class Application {
    public static void main(String[] args) {
        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Kelvin", new Employee("Kelvin", "Amiaka"));
        ht.put("juliet", new Employee("Juliet", "Nduka"));
        //ht.printHashTable();
        //ht.remove("juliet");
        ht.put("precious",new Employee("Precious","Amanze"));
        //ht.remove("precious");
        ht.printHashTable();
    }
}
