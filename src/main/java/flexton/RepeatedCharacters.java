package flexton;

import java.util.Locale;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(firstRepeatedCharUsingArr(str));
    }
    //JavaString

    public static char firstRepeatedChar(String str) {
        for (char c : str.toCharArray()) {
            int firstIndex = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);
            if (firstIndex != lastIndex)
                return c;
        }
        return 0;
    }

    public static char firstNonRepeatedChar(String str) {
        for (char c : str.toCharArray()) {
            int firstIndex = str.indexOf(c);
            int lastIndex = str.lastIndexOf(c);
            if (firstIndex == lastIndex)
                return c;
        }
        return 0;
    }

    public static char firstRepeatedCharUsingArr(String str) {
        boolean[] repeated = new boolean[26];
        for (char c : str.toLowerCase().toCharArray()) {
            if (repeated[c - 'a']) {
                return c;
            }
            repeated[c - 'a'] = true;
        }
        return 0;
    }

}
