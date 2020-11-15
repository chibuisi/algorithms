package google;

import java.util.Arrays;

public class MaxTime {
    public static void main(String[] args) {
        String time = "??:11";
        String res = maxTime(time);
        System.out.println(res);
    }
    public static String maxTime(String time){
        char [] timeArray = time.toCharArray();
        if(timeArray[0] == '?')
            timeArray[0] = (timeArray[1] == '?' || timeArray[1] <= '3') ? '2' : '1';
        if(timeArray[1] == '?')
            timeArray[1] = timeArray[0] == '2' ? '3' : '9';
        timeArray[3] = timeArray[3] == '?' ? '5' : timeArray[3];
        timeArray[4] = timeArray[4] == '?' ? '9' : timeArray[4];
        return Arrays.toString(timeArray);

    }
}
