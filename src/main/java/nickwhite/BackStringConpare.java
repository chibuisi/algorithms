package nickwhite;

public class BackStringConpare {
    public static boolean solve(String s, String t){
        int sSkips = 0;
        int tSkips = 0;
        int sPointer = s.length()-1;
        int tPointer = t.length()-1;

        while(sPointer >= 0 || tPointer >= 0){
            while(sPointer >= 0){
                if (s.charAt(sPointer) == '#') {
                    sSkips += 1;
                    sPointer -= 1;
                }
                else if(sSkips > 0){
                    sSkips -= 1;
                    sPointer -= 1;
                }
                else
                    break;
            }
            while(tPointer >= 0){
                if (t.charAt(tPointer) == '#') {
                    tSkips += 1;
                    tPointer -= 1;
                }
                else if(tSkips > 0){
                    tSkips -= 1;
                    tPointer -= 1;
                }
                else
                    break;
            }
            if(sPointer > 0 && tPointer > 0 && s.charAt(sPointer) != t.charAt(tPointer))
                return false;
            if((sPointer >= 0) != (tPointer >= 0))
                return false;
            sPointer--;
            tPointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "a#c#";
        String t = "ac##";
        System.out.println(solve(s,t));
    }
}
