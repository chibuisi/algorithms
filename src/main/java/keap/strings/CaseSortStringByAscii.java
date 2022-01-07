package keap.strings;

public class CaseSortStringByAscii {
    public static String solution1(String str){
        int [] arr = new int[256];
        for(char c : str.toCharArray()){
            arr[c]++;
        }
        StringBuilder result = new StringBuilder();
        for(int i = 97; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                result.append((char) i);
            }
        }
        for(int i = 0; i < 97; i++){
            for(int j = 0; j < arr[i]; j++){
                result.append((char) i);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution1("defRTSersUXI"));
    }
}
