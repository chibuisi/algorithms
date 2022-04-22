package dailybyte2022;

import java.util.Arrays;

public class CommonValues {
    public static int[] solution1(int [] nums1, int [] nums2){
        int index = 0;
        for(int i = 0; i < nums1.length && i < nums2.length; i++){
            if(nums1[i] == nums2[i])
                nums1[index++] = nums1[i];
        }
        for(int i = index; i < nums1.length; i++){
            nums1[i] = 0;
        }
        return nums1;
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,2,3};
        int [] nums2 = {0,2,2,5};

        System.out.println(Arrays.toString(solution1(nums1, nums2)));
    }
}
