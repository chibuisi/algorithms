package altemetriks.riot;

public class LongestKUniqueCharactersSubstring {
    public static void main(String[] args) {
        System.out.println(solutionOne("aabacbebebe",3));
        System.out.println(solutionOne("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco",5));
    }

    //Not working correctly with some test cases
    public static String solutionOne(String str, int k){
        int left = 0;
        int right = str.length();
        String result = "";
        int pointer = 0;
        while(pointer <= str.length()){
            int index = pointer;
            while(index <= str.length()){
                String substring = str.substring(pointer, index);
                long count = substring.chars().distinct().count();
                if(count == k && substring.length() > result.length()) {
                    result = substring;
                }
                index++;
            }
            pointer++;
        }
//        while(left <= str.length()){
//            String substring = str.substring(0,left);
//            long count = substring.chars().distinct().count();
//            if(count == k && substring.length() > result.length()) {
//                result = substring;
//            }
//            left++;
//        }
//        while(right >= 0 ){
//            String substring = str.substring(right,str.length());
//            long count = substring.chars().distinct().count();
//            if(count == k && substring.length() > result.length()) {
//                result = substring;
//            }
//            right--;
//        }
        return result;
    }
}
