package flexton;

public class StringContain26Letter {
    public static void main(String[] args) {
        String str = "The quick Brown fox jumps over the lazy dog";
        System.out.println(isValidString(str));
    }
    public static boolean isValidString(String str){
        boolean [] found = new boolean[26];
        int index = 0;
        for(char c : str.toCharArray()){
            if('A' <= c && c <= 'Z')
                index = c - 'A';
            if('a' <= c && c <= 'z')
                index = c - 'a';
            found[index] = true;
        }
        for(int i = 0; i < found.length-1; i++){
            if(!found[i]){
                return false;
            }
        }
        return true;
    }
}
