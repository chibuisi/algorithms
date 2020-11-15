package cci;

public class StringCompression {
    public static void main(String[] args) {
        String res = compressString("aabcccccaaa");
        System.out.println(res);
    }
    public static String compressString(String str){
        StringBuilder compressed = new StringBuilder();
        int countRepitions = 0;
        for(int i = 0; i < str.length(); i++){
            countRepitions++;
            if(i + 1>= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed.append(countRepitions);
                compressed.append("[");
                compressed.append(str.charAt(i));
                compressed.append("]");
                countRepitions = 0;
            }
        }
        return compressed.toString();
    }
}
