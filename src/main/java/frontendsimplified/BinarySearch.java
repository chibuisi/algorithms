package frontendsimplified;

public class BinarySearch {
    public static int search(int [] array, int k){
        int left = 0;
        int right = array.length;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (array[mid] == k)
                return mid;
            if(array[mid] > k)
                right = mid - 1;
            else if(array[mid] < k)
                left = mid + 1;
        }
        return -1;
    }

    public static int search2(int [] array, int k){
        if(array == null || array.length == 0 || (array.length == 1 && array[0] != k))
            return -1;
        return search2(array, 0, array.length, k);
    }

    private static int search2(int[] array, int i, int length, int k) {
        if(i >= length)
            return -1;
        int mid = i + (length - i) / 2;
        if(array[mid] == k)
            return mid;
        if(array[mid] > k)
            return search2(array, i, mid - 1, k);
        else
            return search2(array, mid + 1, length, k);
    }


    public static void main(String[] args) {
        //System.out.println(search(new int[]{2,4,5,6,7,8,9}, 9));
        System.out.println(search2(new int[]{2,4,5,6,7,8,9}, 10));
    }
}
