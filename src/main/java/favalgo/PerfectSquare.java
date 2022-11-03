package favalgo;

public class PerfectSquare {
    public static boolean solution(int num){
        int left = 1;
        int right = num;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mid * mid == num)
                return true;
            else if(mid * mid > num)
                right -= 1;
            else
                left += 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
