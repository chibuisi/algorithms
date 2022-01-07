package dailychallenge;

public class TrivalentArray {
    public static boolean solve(int [] array){
        if(array == null || array.length < 2)
            return false;
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
        System.out.println("first => " + first + " Second => " + second + " Third => "+third);
        for(int i = 0; i < array.length; i++){
            int val = array[i];
            if(val != first || val != second || val != third){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int []{ 10, 10, 19, 22, 22}));
    }
}
