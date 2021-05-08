package flexton.practice;

public class RotateImage {
    public static void main(String[] args) {
        int [][] nums = {
                {1,2,3,4,},
                {5,6,7,8,},
                {9,10,11,12,},
                {13,14,15,16}
        };
        print(nums);
        System.out.println();
        rotateImage(nums);
        print(nums);
        rotateImage(nums,2);
        System.out.println();
        print(nums);
    }
    public static void rotateImage(int [][] image, int k){
        for(int i = 0; i < k; i++){
            rotateImage(image);
        }
    }
    public static void rotateImage(int [][] image){
        int N = image.length;
        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][N-1-j];
                image[i][N-1-j] = temp;
            }
        }
    }

    public static void print(int [][] arr){
        for(int[] ar: arr){
            for (int num : ar){
                System.out.print(num+", ");
            }
            System.out.println();
        }
    }
}
