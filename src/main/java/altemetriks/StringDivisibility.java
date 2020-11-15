package altemetriks;

import java.util.HashSet;

public class StringDivisibility {
    public static void main(String[] args) {
        String s =  "bcdbcdbcdbcd";
        String t = "bcdbcd";
        int result = findSmalletDivisor(s,t);
        System.out.println(result);
    }
    public static int findSmalletDivisor(String s, String t){
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
}
