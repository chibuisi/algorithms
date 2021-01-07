package juliet.miu;

public class MNSequencedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,2,5};
        System.out.println(mnSequenced(arr,2,5));
    }
    public static int mnSequenced(int [] arr, int m, int n){
        int len = arr.length - 1;
        for(int i = 0; i < len; i++){
            if(i == 0 && arr[i] != m)
                return 0;
            if(i < len && arr[i] == arr[i+1])
                continue;
            if(arr[i] != arr[i+1] && arr[i+1] - arr[i] > 1)
                return 0;
            if(i == len && arr[i] != n)
                return 0;
        }
        return 1;
    }
}
