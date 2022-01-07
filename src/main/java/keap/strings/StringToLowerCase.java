package keap.strings;

public class StringToLowerCase {
    public static String solution1(String str){
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c >= 'A' && c <= 'Z')
                result.append((char)(c+32));
            else
                result.append((char)(c-32));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("Briana"));
        System.out.println((int)'a');
        System.out.println((int)'A');
        System.out.println('A' - 'a');
    }
}
