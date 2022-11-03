package frontendsimplified;

import java.util.Arrays;

public class MeetingTimes {
    public static String solve(String [] times1, String [] times2, int duration){
        sort(times1);
        sort(times2);
        int p1 = 0;
        int p2 = 0;

        while(p1 <times1.length && p2 < times2.length){
            int start = Integer.max(Integer.parseInt(times1[p1].substring(0,2)), Integer.parseInt(times2[p2].substring(0,2)));
            int end = Integer.min(Integer.parseInt(times1[p1].substring(3)), Integer.parseInt(times2[p2].substring(3)));
            if(start - end >= duration)
                return start+""+(start+duration);
            if(Integer.parseInt(times1[p1].substring(3)) < Integer.parseInt(times2[p2]))
                p1++;
            if(Integer.parseInt(times2[p2].substring(3)) < Integer.parseInt(times1[p1]))
                p2++;
            else{
                p1++; p2++;
            }
        }
        return "";
    }

    private static String sort(String [] array){
        Arrays.sort(array, (a, b) -> {
            int t10 = Integer.parseInt(a.substring(0,2));
            int t20 = Integer.parseInt(b.substring(0,2));
            int t11 = Integer.parseInt(a.substring(3));
            int t21 = Integer.parseInt(b.substring(3));
            if(t10 == t20)
                return t11 - t21;
            return t10-t20;
        });
        return Arrays.toString(array);
    }
}
