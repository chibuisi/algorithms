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

        Collection<Object> objects = new ArrayDeque<>();


        Set<Integer> integerHash = new HashSet<>();
        integerHash.add(3); integerHash.add(2); integerHash.add(1);//3,2,1
        Set<Integer> integerTree = new TreeSet<>();
        integerTree.add(3); integerTree.add(2); integerTree.add(1);//1,2,3
        System.out.println(integerHash);
        System.out.println(integerTree);

        String [] array = {"hate", "crime", "suicide", "rape"};
        List<String> list = Arrays.asList(array);
        String [] arr = list.toArray(new String[list.size()]);
        System.out.println(list);
        java.util.Collections.reverse(list);
        System.out.println(list);
        //System.out.println(Arrays.toString(arr));
    }
}
