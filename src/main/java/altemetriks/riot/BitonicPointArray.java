package altemetriks.riot;

public class BitonicPointArray {
    public static void main(String[] args) {
        int arr[] = {1,15,25,45,42,21,17,12,11};
        System.out.println(bitonicPoint(arr));

    }

    public static int bitonicPoint(int [] array){
        if(array.length == 1)
            return array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i-1])
                return array[i-1];
        }
        return array[array.length-1];
    }
}
