package riotgames.practice;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

    }
    public static void squaresSortedArray(int [] nums){
        if(nums==null || nums.length==0) return;
        int positivePointer = 0;
        while(positivePointer < nums.length && nums[positivePointer] < 0)
            positivePointer+=1;
        int negativePointer = positivePointer-1;

        int [] result = new int[nums.length];
        int index = 0;

        while(negativePointer > 0 && positivePointer < nums.length-1){
            int posSquare = nums[positivePointer] * nums[positivePointer];
            int negSquare = nums[negativePointer] * nums[negativePointer];

            if(posSquare < negSquare){
                result[index] = posSquare;
                positivePointer+=1;
            } else{
                result[index] = negSquare;
                negativePointer-=1;
            }
            index++;
        }
    }
}
