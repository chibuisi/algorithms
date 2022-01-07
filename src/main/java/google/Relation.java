package google;

import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Relation {
    private String parent;
    private String child;
}


class Main{
    public static void print(Iterable<Relation> relations){
        Map<String, List<Relation>> relationListMap = new HashMap<>();
        Iterator<Relation> iterator = relations.iterator();
        relations.forEach(e -> {
            if(relationListMap.containsKey(e.getParent())){
                List<Relation> list = relationListMap.get(e.getParent());
                list.add(e);
                relationListMap.put(e.getParent(), list);
            }
            else{
                List<Relation> list = new ArrayList<>();
                list.add(e);
                relationListMap.put(e.getParent(), list);
            }
        });
       /* while(iterator.hasNext()){
            Relation relation = iterator.next();
            if(relationListMap.containsKey(relation.getParent())){
                List<Relation> list = relationListMap.get(relation.getParent());
                list.add(relation);
                relationListMap.put(relation.getParent(), list);
            } else{
                List<Relation> list = new ArrayList<>();
                //list.add(relation);
                relationListMap.put(relation.getParent(), list);
            }
        }*/
        System.out.println(relationListMap);
    }
    public static void main(String[] args) {
        List<Relation> relations = Arrays.asList(
                new Relation("animal", "dog"),
                new Relation("animal", "cat"),
                new Relation("cat", "tiger"),
                new Relation("lifelong", "animal")
        );

        print(relations);
    }
}