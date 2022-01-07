package flexton.practice;

public class DivisiblePairs {
    public static void main(String[] args) {
        int [] nums = {20,40,60,50,60,120,100};
        System.out.println(divisblePairs(nums));
    }
    public static int divisblePairs(int [] num){
        int count = 0;
        int [] remainder = new int[60];
        for(int i = 0; i < num.length; i++){
            if(num[i] % 60 == 0)
                count+=1;
            else
                count += remainder[60 - num[i] % 60];
            remainder[num[i] % 60]++;
        }
        return count;
    }
}
