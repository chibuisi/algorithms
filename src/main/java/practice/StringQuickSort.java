package practice;

import java.util.Arrays;

public class StringQuickSort {
    public static void main(String[] args) {
        String [] arr = {"boy", "friend", "love", "boyant"};
        sortStringArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortStringArray(String [] array){
        //sortEachString(array);
        //Runtime = O(a*s log s) where s is length
        //of longest string
        for(int i = 0; i < array.length; i++){
            char [] word = array[i].toCharArray();
            Arrays.sort(word);
            array[i] = new String(word);
        }
        //sortEntireArray(array);
        //Runtime = O(a.s log a) where a is the length of the array
        Arrays.sort(array);
    }
}
