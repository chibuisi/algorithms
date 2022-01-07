package nickwhite.matrix;

public class Search2DMatrix {
    //each row is sorted from left to right
    //first integer in each row is greater than the last integer of the previous row.
    public static boolean search(int [][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            int midValue = matrix[mid/cols][mid%cols];
            if(target == midValue)
                return true;
            else if(target < midValue)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(search(arr,3));
    }
}
