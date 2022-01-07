package google;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HousesAndStores {
    public static void main(String[] args) {
        int [] houses = new int[]{2,4,2};
        int [] stores = new int[]{5,1,2,3};
        int [] res = shorterDistance(houses,stores);
        System.out.println(Arrays.toString(res));
    }

    public static int[] shorterDistance(int[]houses, int[]stores){
        int [] result = new int[houses.length];
        TreeSet<Integer> set = new TreeSet<Integer>();

        for(int store : stores){
            set.add(store);
        }
        for(int i=0; i < houses.length; i++){
            if(set.floor(houses[i]) != null && set.ceiling(houses[i]) != null){
                if(houses[i] - set.floor(houses[i]) <= set.ceiling(houses[i])){
                    result[i] = set.floor(houses[i]);
                }
                else result[i] = set.ceiling(houses[i]);
            }
            else if(set.floor(houses[i]) != null){
                result[i] = set.floor(houses[i]);
            }
            else result[i] = set.ceiling(houses[i]);
        }
        return result;
    }
}
