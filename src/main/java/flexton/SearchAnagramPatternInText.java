package flexton;

public class SearchAnagramPatternInText {
    public static void main(String[] args) {
        search("BACDGABC","ABCD");
    }
    static final int MAX = 256;
    private static boolean compare(char [] c1, char [] c2){
        for(int i = 0; i < MAX; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
    public static void search(String text, String pattern){
        int n = text.length();
        int m = pattern.length();

        char [] countP = new char[MAX];
        char [] countTW = new char[MAX];
        for(int i = 0; i < m; i++){
            countP[pattern.charAt(i)]++;
            countTW[text.charAt(i)]++;
        }
        for(int i = m; i < n; i++){
            if(compare(countP,countTW))
                System.out.println("found at index "+(i-m));
            countTW[text.charAt(i)]++;
            countTW[text.charAt(i-m)]--;
        }
        if(compare(countP,countTW))
            System.out.println("found at index "+(n-m));
    }
}
