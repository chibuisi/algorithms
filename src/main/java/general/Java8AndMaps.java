package general;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8AndMaps {
    public static void main(String[] args) {
        Stream<Integer> ints = Stream.empty();
        Map<String, List<Integer>> data = new HashMap<>();
        data.put("one", Arrays.asList(5,1,null,5));
        data.put("two", Arrays.asList(null,1,1,5));

        Set<Map.Entry<String, List<Integer>>> entries = data.entrySet();
        //entries.forEach(System.out::println);
        List<Integer> integers = new ArrayList<>();
        for(Map.Entry entry : entries){
            String str = (String) entry.getKey();
            List<Integer> stringSet = (List<Integer>) entry.getValue();
            for(Integer i : stringSet){
                integers.add(i);
            }
        }
        //System.out.println(integers);

        Set<String> keysSet = data.keySet();
        Collection<List<Integer>> dataValues = data.values();

        //convert Map<String,List<Integer>> to List<List<Integer>>
        List<List<Integer>> dataValues2 = data.entrySet().stream().map(Map.Entry::getValue)
                .filter(i -> i != null)
                .collect(Collectors.toList());
        List<String> dataSet = data.keySet().stream().collect(Collectors.toList());
        List<Integer> dataValues3 = data.entrySet().stream()
                .flatMap(v -> v.getValue().stream())
                .filter(i -> i != null)
                .collect(Collectors.toList());
        System.out.println(dataValues3);

        //count number of nulls - check
        //remove nulls - check
        //sum values in each entry
        //sum all values
        //convert Map<String,List<Integer>> to List<List<Integer>>

        long numNulls = data.entrySet().stream()
                .flatMap(d -> d.getValue().stream())
                .filter(e -> e==null).count();
        //System.out.println(numNulls);

        //summ all values
        IntSummaryStatistics stat = data.entrySet().stream()
                .flatMap(d -> d.getValue().stream())
                .filter(i -> i != null)
                .collect(Collectors.summarizingInt(Integer::intValue));
        long sum = stat.getSum();
        //System.out.println(sum);

        //remove nulls
//        Map<String, List<Integer>> dataValid = data.entrySet().stream()
//                .flatMap(d -> d.getValue().stream())
//                .filter(i -> i != null)
//                .map(Map.Entry::getValue)
//                .collect(Collectors.toMap(Function.identity(),Map.Entry::getValue));

        //sum values in each entry
        //List<Integer> entriesSum = data.entrySet().stream().reduce(
    }
}
