package flexton;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Friends";
        System.out.println(recursiveReverse(word));
        System.out.println("iteration");
        System.out.println(iterativeReversal(word));
    }
    public static String recursiveReverse(String str){
        if(str.isEmpty())
            return str;
        return recursiveReverse(str.substring(1)) + str.charAt(0);
    }

    public static String iterativeReversal(String str){
        StringBuilder res = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            res.append(str.charAt(i));
        }
        return res.toString();
    }

}
