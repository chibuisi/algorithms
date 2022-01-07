package keap.maths;

public class SquareRoot {
    public static int solution1(int num){
        if(num == 0 || num == 1)
            return num;
        int result = 0;
        int counter = 1;
        while(result < num){
            result = counter * counter;
            counter += 1;
        }
        return counter - 1;
    }

    public static int solution2(int num){
        if(num == 0 || num == 1)
            return num;
        int left = 1;
        int right = num;
        int ans = 0;
        while(left <= right){
            int mid = left + (right - left);
            if(mid * mid == num)
                return mid;
            else if(mid * mid > num)
                right = mid - 1;
            else {
                left = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution1(121));
        System.out.println(solution2(121));
    }
}
