package dailychallenge;

public class ThirdLargestValue {
    public static int solve(int [] array){
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int val = array[i];
            if(first < val){
                third = second;
                second = first;
                first = val;
            }
            else if(second < val){
                third = second;
                second = third;
            }
            else if(third < val) {
                third = second;
            }
        }
        return third;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,2,1,3,4,2,3,4,5,2}));
    }
}
