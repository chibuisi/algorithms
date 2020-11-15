package dailychallenge;
//GIven a sorted array with repeating integers, count the number of occurences
//of k
public class CountOccurences {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7,8,9,9,9,10};
        System.out.println(countOccurences(arr,9));
    }
    public static int countOccurences(int[]array, int k){
        return countOccurences(array, 0, array.length-1, k);
    }
    public static int countOccurences(int [] array, int start, int end, int k){
        int count = 0;
        if(start>=end) {
            return 0;
        }
        int mid = (start + end) / 2;
        if(array[mid] == k){
            count+=1;
            if(array[mid-1] == k)
                count+=countOccurences(array,start,mid,k);
            count+=countOccurences(array,mid+1,end,k);
        }
        else if(array[mid] < k){
            count += countOccurences(array,mid+1,end,k);
        }
        else{
            count += countOccurences(array,start,mid,k);
        }
        return count;
    }
}
