package amazon;

import java.util.Arrays;
import java.util.List;

public class PairsDivisibleBy60 {
    public static void main(String[] args) {
        List<Integer> songs = Arrays.asList(60,30,150,100,40,80,120);
        System.out.println(numPairsDivisibleby60(songs));
    }
    public static int numPairsDivisibleby60(List<Integer> songs){
        int count = 0;
        int [] remainders = new int[60];
        for(Integer time : songs){
            if(time % 60 == 0)
                count++;
            else
                count += remainders[60 - time % 60];
            remainders[time % 60]++;
        }
        return count;
    }
}
