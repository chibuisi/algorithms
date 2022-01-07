package dailybyte;

import java.util.Arrays;

public class SpotTheDifference {
    public static char solve(String s, String t){
        char [] sArray = s.toCharArray();
        char [] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        int i = 0;
        for(i = 0; i < sArray.length; i++){
            if(sArray[i] != tArray[i])
                return tArray[i];
        }
        if(i < tArray.length){
            return tArray[i++];
        }
        else{
            return ' ';
        }
    }

    public static char solve2(String s, String t){
        int [] sArray = new int[26];

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int index = c - 'a';
            sArray[index]++;
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            int index = c - 'a';
            sArray[index]++;
        }
        for(int i = 0; i < sArray.length; i++){
            if(sArray[i] == 1){
                char c = (char) (i + 'a');
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        //System.out.println(solve("foobar", "barfoot"));
        //System.out.println(solve("ide", "idea"));
        //System.out.println(solve("coding", "ingcod"));
//        char c = 'b';
//        int index = c - 'a';
//        System.out.println(index);
        System.out.println(solve2("foobar", "barfoot"));
        System.out.println(solve2("ide", "idea"));
        System.out.println(solve2("coding", "ingcod"));
    }
}
