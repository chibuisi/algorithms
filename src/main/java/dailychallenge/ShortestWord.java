package dailychallenge;
//Given a string of words, return the length of the shortest word in the string.
public class ShortestWord {
    public static void main(String[] args) {
        String sentence = "let us talk about javascript";
        int count = shortestWord(sentence);
        System.out.println(count);
    }
    public static int shortestWord(String sentence){
        String [] words = sentence.split(" ");
        int count = shortestWord(words, 0, words.length-1);
        return count;
    }
    private static int shortestWord(String[] words, int start, int end){
        if(start>=end)
            return words[start].length();
        int max = Math.min(words[start].length(),words[end].length());
        int mid = (start+end) / 2;
        int leftMinCount = Math.min(max,shortestWord(words,start,mid));
        int rightMinCount = shortestWord(words,mid+1,end);
        return Math.min(leftMinCount,rightMinCount);
    }
}
