package altemetriks.riot;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        System.out.println(solutionOne("baaaab"));
    }
    public static String solutionOne(String str){
        String result = "";
        int leftPointer = 0;
        int rightPointer = str.length() -1;
        while(rightPointer > leftPointer){
            if(str.startsWith(str.substring(rightPointer))){
                result = str.substring(rightPointer);
                rightPointer--;
            }
            else {
                rightPointer--;
            }
        }
        return result;
    }
}
