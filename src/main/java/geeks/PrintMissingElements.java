package geeks;

public class PrintMissingElements {
    public static void main(String[] args) {
        int [] nums = {88,105,3,2,200,0,10};
        printMissing(nums);
    }
    public static void printMissing(int [] nums){
        boolean [] present = new boolean[100];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num >= 0 && num <= 99)
                present[nums[i]] = true;
        }
        int i = 0;
        while(i < present.length-1){
            if(!present[i]){
                int j = i + 1;
                while(present[j] == false && j < present.length-1){
                    j++;
                }
                System.out.println(i+" - "+(j-1));
                //update i
                i = j;
            }
            else{
                i++;
            }
        }

    }
}
