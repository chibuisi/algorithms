package youtube;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("string1", "string2", "string3", "string4", "string5");
        List<Integer> integersList = Arrays.asList(12,21,23,32,43,55,43,21);

        Stream<Integer> stream = CreatingStreams.fromACollection(integersList);
        Stream<String> stringStream = CreatingStreams.fromACollection(stringsList);

        Stream<Integer> emptyIntegerList = CreatingStreams.emptyStream();
    }
    public static  <T> Stream<T> fromACollection(Collection collection){
        Stream<T> streamFromCollection = collection.stream();
        return streamFromCollection;
    }

    public static <T> Stream<T> fromAnArray(T [] array){
        Stream<T> stream = Arrays.stream(array);
        return stream;
    }

    public static <T> Stream<T> emptyStream(){
        Stream<T> stream = Stream.empty();
        return stream;
    }

    public static Stream<Double> infiniteStream(int limit){
        Stream<Double> stream = Stream.generate(Math::random).limit(limit);
        return stream;
    }
}
