package cvs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CVSFinal {
    private String [] strings = new String[0];

    public void add(String str){
        List<String> l = Stream.of(strings).collect(Collectors.toList());
        l.add(str);
        strings = Stream.of(l).toArray(String[]::new);
        int pos = -1;
        for(int i = 0; i < strings.length; i++){
            if(strings[i] == str){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            String [] newStrings = new String[strings.length+1];
            int i = 0;
            for(i = 0; i < strings.length; i++){
                newStrings[i] = strings[i];
            }
            newStrings[i++] = str;
            strings = newStrings;
        }
    }

    public void remove(String str){
        int pos = find(str);
        int len = strings.length;
        int index = 0;
        if(pos != -1){
            String [] newStrings = new String[len-1];
            for(int i = 0; i < len; i++){
                if(i != pos){
                    newStrings[index++] = strings[i];
                }
            }
            strings = newStrings;
        }
    }

    public int find(String str){
        return Arrays.binarySearch(strings, str);
    }

    public void print(){
        System.out.println(Arrays.toString(strings));
    }

    public static void main(String[] args) {
        CVSFinal cvsFinal = new CVSFinal();
        cvsFinal.add("Chibuisi");
        cvsFinal.add("John");
        cvsFinal.print();
        cvsFinal.remove("Chibuisi");
        //cvsFinal.remove("John");
        cvsFinal.print();
    }
}
