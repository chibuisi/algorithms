package riotgames.practice;

public class StringCompression {
    public static void main(String[] args) {

    }
    public static String compressString(String str){
        if(str == null || str.length() == 0) return str;
        int countRepetitions = 0;
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(i + 1 >= str.length() || str.charAt(1) != str.charAt(i + 1)){
                result.append(countRepetitions);
                result.append("[");
                result.append(str.charAt(i));
                result.append("]");
                countRepetitions = 0;
            }
        }
        return result.toString();
    }
}
