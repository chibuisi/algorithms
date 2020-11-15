package cci;

public class TwoArrayElements {
    public static void main(String[] args) {
        int [] arr1 = {13,27,35,40,49,55,59};
        int [] arr2 = {17,35,39,40,55,58,60};
        int count = commonElements(arr1,arr2);
        System.out.println(count);
    }

    public static int commonElements(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int count = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                count++;
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j])
                j++;
            else
                i++;
        }
        return count;
    }
}
