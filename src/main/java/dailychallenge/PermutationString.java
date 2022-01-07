package dailychallenge;

public class PermutationString {
    public static void solve(String str){
        permutation(str, "");
    }
    private static void permutation(String s, String temp){
        if(s.length() == 0) {
            System.out.println(temp);
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            permutation(s.substring(0,i) + s.substring(i+1), temp+c);
        }
    }

    public static void main(String[] args) {
        solve("abc");
    }
}
