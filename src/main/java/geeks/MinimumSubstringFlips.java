package geeks;

public class MinimumSubstringFlips {
    public static void main(String[] args) {
        String s1 = "100001";
        String s2 = "110111";
        System.out.println(canFlipStrings(s1,s2));
    }
    //time - O(n), space - O(1)
    public static int canFlipStrings(String s1, String s2){
        if(s1.length() != s2.length())
            return -1;
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                while(i < s1.length() && s1.charAt(i) != s2.charAt(i))
                    i++;
                count++;
            }
        }
        return count;
    }
}
