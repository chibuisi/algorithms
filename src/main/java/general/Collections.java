package general;

import java.util.*;
import java.util.concurrent.*;
//DS
//Collection, List, Set, Map, Queue
public class Collections {
    public static void main(String[] args) {
        //List interface implementing classes (ArrayList, LinkedList, Vector, Stack)
        List<String> l1 = new LinkedList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new Vector<>();
        List<String> l4 = new Stack<>();
        //note a stack is a vector, a vector is a list, therefore a stack is a list
        //Queue interface implementing classes (ArrayDeque, PriorityQueue, LinkedList,
        // ConcurrentLinkedDeque, LinkedBlockingDeque)
        Queue<String> q = new ArrayDeque<>();
        Queue<String> q1 = new PriorityQueue();
        Queue<String> q3 = new LinkedList<>();
        Queue<String> q4 = new LinkedBlockingDeque<>();
        //Set interface implementing classes (HashSet, TreeSet, LinkHashSet,
        // CopyOnWriteArraySet, ConcurrentSkipListSet)
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<String> set3 = new LinkedHashSet<>();
        Set<String> set4 = new ConcurrentSkipListSet<>();
        //Map interface implementing classes (HashMap, TreeMap, LinkedHashMap,
        // ConcurrentHashMap, WeakHashMap, Hashtable)
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new TreeMap<>();
        Map<String,String> map3 = new LinkedHashMap<>();
        Map<String,String> map4 = new ConcurrentHashMap<>();
        Map<String,String> map5 = new WeakHashMap<>();
        Map<String,String> map6 = new Hashtable<>();

        Collection<Object> objectsArrayList = new ArrayList<>();
        Collection<Object> objectsLinkedList = new LinkedList<>();
        Collection<Object> objectsArrayDeque = new ArrayDeque<>();
        Collection<Object> objectsPriorityQueue = new PriorityQueue<>();
        Collection<Object> objectsHashSet = new HashSet<>();
        Collection<Object> objectsTreeSet = new TreeSet<>();
    }
}
