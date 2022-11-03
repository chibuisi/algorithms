package plane;

public class Practice {
    public static void solve(String input){
        if(input.length() == 0 || input == null)
            return;
        char c = input.charAt(input.length()-1);
        if(Character.isDigit(c)){
            c += 1;
            input = input.substring(0, input.length()-1) + c;
        }
        System.out.println(input);
    }
    public static void main(String[] args) {
        solve("string8");
    }
}
