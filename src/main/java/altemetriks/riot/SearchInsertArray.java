package altemetriks.riot;

public class SearchInsertArray {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        System.out.println(solutionTwo(arr,5));
    }
    public static int solutionOne(int [] array, int num){
        for(int i = 0; i < array.length; i++){
            if(array[i] >= num)
                return i;
        }
        return -1;
    }
    public static int solutionTwo(int [] array, int num){
        int index = array.length - 1;
        if(num < array.length - 1)
            index = array[num-1];
        if(index == num)
            return num;
        if(index > num)
            return index - num;
        else{
            while(num < array[index] && index < array.length-1){
                index++;
            }
        }
        return array[index-1];
    }
}
