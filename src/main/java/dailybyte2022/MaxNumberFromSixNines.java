package dailybyte2022;

public class MaxNumberFromSixNines {
    public static int solve(int num){
        int added = 0;
        int cur = 1;
        int curNum = num;
        while(curNum > 0) {
            if(curNum % 10 == 6)
                added = cur;
            cur *= 10;
            curNum = curNum / 10;
        }
        return num + added * 3;
    }

    public static int solve2(int num){
        String numString = Integer.toString(num);
        StringBuilder result = new StringBuilder();
        int index = 0;
        while(index < numString.length()){
            if(numString.charAt(index) == '6') {
                result.append('9');
                index++;
                break;
            }
            else{
                result.append(numString.charAt(index));
                index++;
            }
        }
        result.append(numString.substring(index));
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        System.out.println(solve(9999699));
        System.out.println(solve2(9999699));
    }
}
