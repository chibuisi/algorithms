package dailybyte;

import java.util.Stack;

public class CompareKeyStrokes {
    public static boolean solve(String s, String t){
        int sSkips = 0;
        int tSkips = 0;
        int sPointer = s.length()-1;
        int tPointer = t.length()-1;

        while(sPointer >= 0 || tPointer >= 0){
            while(sPointer >= 0){
                if(s.charAt(sPointer) == '#'){
                    sSkips += 1;
                    sPointer -= 1;
                }
                else if(sSkips > 0) {
                    sSkips -= 1;
                    sPointer -= 1;
                }
                else break;
            }
            while(tPointer >= 0){
                if(t.charAt(tPointer) == '#'){
                    tSkips += 1;
                    tPointer -= 1;
                }
                else if(tSkips > 0) {
                    tSkips -= 1;
                    tPointer -= 1;
                }
                else break;
            }
            if(sPointer > 0 && tPointer > 0 && s.charAt(sPointer) != t.charAt(tPointer))
                return false;
            if( (sPointer >= 0) != (tPointer >= 0))
                return false;
            sPointer--;
            tPointer--;
        }
        return true;
    }

    public static boolean solve2(String s, String t){
        if(s == null && t == null) return true;
        String sEdited = editString(s);
        String tEdited = editString(t);

        return sEdited.equals(tEdited);
    }

    private static String editString(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < s.length()){
            char c = s.charAt(index++);
            if(c != '#')
                stack.push(c);
            else if(c == '#' && !stack.isEmpty())
                stack.pop();
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty())
            result.append(stack.pop());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve2("ab#", "a#"));
    }
}
