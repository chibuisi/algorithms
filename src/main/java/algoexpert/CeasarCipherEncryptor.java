package algoexpert;

public class CeasarCipherEncryptor {
    public static void main(String[] args) {
        //System.out.println(caesarCypherEncryptor("xyz",2));
        System.out.println(Math.abs(-1 - 26));
    }
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char [] newLetters = new char[str.length()];
        int newKey = key % 26;
        for(int i = 0; i < str.length(); i++){
            newLetters[i] = getNewLetter(str.charAt(i), newKey);
        }
        return new String(String.copyValueOf(newLetters));
    }
    public static char getNewLetter(char c, int key){
        int newLetter = c + key;
        return newLetter <= 122 ? (char) newLetter : (char) (96 + newLetter % 122);
    }
}
