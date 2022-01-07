package altemetriks.google;

public class LowestCommonPrefix {
    public static String solve(String [] strings){
        String prefix = strings[0];
        for(int i = 1; i < strings.length; i++){
            String str = strings[i];
            while(str.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length()-1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        String [] strs = {"flower", "flo", "fl"};
        System.out.println(solve(strs));
    }
}
