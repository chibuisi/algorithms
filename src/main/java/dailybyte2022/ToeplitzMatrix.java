package dailybyte2022;

public class ToeplitzMatrix {
    public static boolean solve(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(row > 0 && col > 0 && row < arr.length && col < arr[0].length){
                    if(arr[row][col] != arr[row-1][col-1])
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3},
                        {4, 1, 2},
                        {5, 4, 1}};
        System.out.println(solve(arr));
    }
}
