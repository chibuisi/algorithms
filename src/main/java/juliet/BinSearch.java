package juliet;

public class BinSearch {
    public static boolean search(String s, char c){
        int start = 0;
        int end = s.length();

        if(s.length() == 0)
            return false;

        int mid = start + (end - start) / 2;
        if(s.charAt(mid) == c)
            return true;
        else if(c < s.charAt(mid))
            return search(s.substring(0,mid), c);
        else
            return search(s.substring(mid), c);
    }

    public static void main(String[] args) {
        System.out.println(search("abcdefghi", 'a'));
    }
}
