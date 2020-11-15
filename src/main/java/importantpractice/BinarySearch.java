package importantpractice;

public class BinarySearch {
    //Array has to be sorted for binary search to work
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        //int value = iterativeBinarySearch(arr,20);
        int value = recursiveBinarySearch(arr,1);
        System.out.println(value);
    }
    public static int iterativeBinarySearch(int [] array, int value){
        int start = 0;
        int end = array.length;

        while(start < end){
            int midpoint = (start + end) / 2;
            if(array[midpoint] == value)
                return midpoint;
            if(array[midpoint] < value){
                start = midpoint + 1;
            }
            else if(array[midpoint] > value){
                end = midpoint - 1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int [] array, int value){
        return recursiveBinarySearch(array, 0, array.length,6);
    }
    public static int recursiveBinarySearch(int[] array, int start, int end, int value){
        if(start >= end)
            return -1;
        int midpoint = (start + end)/2;
        if(array[midpoint] == value)
            return midpoint;
        else if(array[midpoint] < value){
            return recursiveBinarySearch(array,midpoint+1,end,value);
        }
        else
            return recursiveBinarySearch(array,start,midpoint,value);
    }
}
