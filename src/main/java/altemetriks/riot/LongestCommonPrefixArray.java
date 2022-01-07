package altemetriks.riot;

public class LongestCommonPrefixArray {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(solutionTwo(arr));
    }
    public static String solutionOne(String [] array){
        String result = "";
        int longest = 0;
        String longestString = "";
        for(String s : array){
            if(s.length() > longest){
                longest = s.length();
                longestString = s;
            }
        }
        for(int k = 0; k < longest; k++){
            for(int i = k + 1; i < longestString.length(); i++){
                int flag = 1;
                String s = array[0].substring(k,i);
                for (String str : array){
                    if(!str.contains(s))
                        flag = -1;
                }
                if (flag == 1 && s.length() > result.length()) {
                    result = s;
                }
            }
        }

        return result;
    }
    public static String solutionTwo(String [] array){
        String prefix = array[0];
        for(int i = 0; i < array.length; i++){
            prefix = prefixUtil(prefix, array[i]);
        }
        return prefix;
    }

    private static String prefixUtil(String strOne, String strTwo){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < strOne.length() && i < strTwo.length(); i++){
            if(strOne.charAt(i) != strTwo.charAt(i))
                break;
            builder.append(strOne.charAt(i));
        }
        return builder.toString();
    }
}
