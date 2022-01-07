package altemetriks.riot;

public class RomanNumberInteger {
    public static void main(String[] args) {
        System.out.println(solutionOne("dxxxiii"));
    }

    public static int solutionOne(String str){
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            int value = value(str.charAt(i));
            int nextValue = i + 1 < str.length() ? value(str.charAt(i+1)) : 0;
            if(value >= nextValue)
                result += value;
            else {
                result += nextValue - value;
                i++;
            }
        }
        return result;
    }
    //cd = 400

    static int value(char ch){
        if(ch == 'i')
            return 1;
        if(ch == 'v')
            return 5;
        if(ch == 'x')
            return 10;
        if(ch == 'l')
            return 50;
        if(ch == 'c')
            return 100;
        if(ch == 'd')
            return 500;
        if(ch == 'm')
            return 1000;
        return -1;
    }


}
