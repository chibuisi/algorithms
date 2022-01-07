package cvs;

import java.util.Arrays;

public class KrysArrayList {
    private String [] strings = new String[0];

    public void add(String str){
        int pos = -1;
        for(int j = 0; j < strings.length; j++){
            if(strings[j] == str){
                pos = j;
                break;
            }
        }
        if(pos == -1) {
            int len = strings.length;
            String[] newStrings = new String[len + 1];
            int i = 0;
            for (i = 0; i < len; i++) {
                newStrings[i] = strings[i];
            }
            newStrings[i++] = str;
            strings = newStrings;
        }
    }
    public void delete(String str){
        int pos = -1;
        for(int j = 0; j < strings.length; j++){
            if(strings[j] == str){
                pos = j;
            }
        }
        int index = 0;
        int len = strings.length;
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
    public void print(){
        System.out.println(Arrays.toString(strings));
    }
}
