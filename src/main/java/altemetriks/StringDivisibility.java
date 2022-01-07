package altemetriks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringDivisibility {
    public static void main(String[] args) {
        String s =  "bcdbcdbcdbcd";
        String t = "bcdbcd";
        int result = findSmallestDivisor(s,t);
        System.out.println(result);
        String result1 = smallestStringDivisor(s,t);
        System.out.println(result1);
    }
    public static int findSmallestDivisor(String s, String t){
        StringBuilder str = new StringBuilder(t);
        while(str.length() < s.length()){
            str.append(t);
        }
        HashSet<Character> setChars = new HashSet<>();
        if(str.toString().equals(s)){
            for(char c : t.toCharArray()){
                setChars.add(c);
            }
        }
        return setChars.size() > 0 ? setChars.size() : -1;
    }
    public static String smallestStringDivisor(String s, String t){
        StringBuilder str = new StringBuilder(t);
        while(str.length() < s.length()){
            str.append(t);
        }
        Set<Character> uniqueChars = new HashSet<>();
        if(str.toString().equals(s)){
            for(char c : s.toCharArray()){
                uniqueChars.add(c);
            }
        }
        str = new StringBuilder();
        Iterator i = uniqueChars.iterator();
        while(i.hasNext()){
            str.append(i.next());
        }
        return str.toString();
    }
}
