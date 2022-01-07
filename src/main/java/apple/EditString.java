package apple;

import java.util.Arrays;

public class EditString {
    public static void main(String[] args) {
        String [] dict = {"ddaca", "kdckd"};
        System.out.println(solve("abcab", dict));
    }

    public static int solve(String initWord, String [] dictioinary){

        int count = 0;
        for(String word : dictioinary){
            for(int i = 0; i < word.length(); i++){
                if(initWord.charAt(i) != word.charAt(i)){
                    char c = initWord.charAt(i);
                    String newInitWord = initWord.replaceAll(c+"", word.charAt(i)+"");
                    System.out.println(newInitWord);
                    char [] wordArr = word.toCharArray();
                    Arrays.sort(wordArr);
                    String sWord = new String(wordArr);
                    char [] initWordArr = newInitWord.toCharArray();
                    Arrays.sort(initWordArr);
                    String sInitWord = new String(initWordArr);
                    if(sWord.equals(initWordArr)) {
                        count++;
                        continue;
                    }
                }
            }
        }
        return count;
    }
}
