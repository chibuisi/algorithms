package dailychallenge;

public class LargestElementInArray {
    public static int solve(int [] array){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            largest = Math.max(largest, array[i]);
        }
        return largest;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,2,1,3,4,2,3,4,5,3,2}));
    }
}
