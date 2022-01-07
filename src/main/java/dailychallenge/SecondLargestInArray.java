package dailychallenge;

public class SecondLargestInArray {
    public static int solve(int [] array){
        int first, second;
        first = second = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int val = array[i];
            if(val > first){
                second = first;
                first = val;
            }
            else if(val > second){
                second = first;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,2,1,3,4,2,3,4,5,3,2}));
    }
}
