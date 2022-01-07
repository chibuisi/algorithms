package hackerrank;

public class TimeConversion {
    public static String solve(String s){
        //if hour < 12 and AM, print it
        //if hour < 12 and PM, add 12 to hour
        //if hour == 12 and AM, make hour as 00
        //if hour == 12 and PM, print it

        String [] str = s.split(":");

        int hour = Integer.parseInt(str[0]);
        String min = str[1];
        String sec = str[2].substring(0,2);
        String period = str[2].substring(2);

        String time = "";
        if(hour < 12 && period.equalsIgnoreCase("AM")) {
            if(hour < 10)
                time = "0" + hour + ":" + min + ":" + sec;
            else
                time = hour + ":" + min + ":" + sec;
        }
        else if(hour < 12 && period.equalsIgnoreCase("PM"))
            time = hour + 12 + ":" + min + ":" + sec;
        else if(hour == 12 && period.equalsIgnoreCase("AM"))
            time = "00" + ":" + min + ":" + sec;
        else if(hour == 12 && period.equalsIgnoreCase("PM"))
            time = hour + ":" + min + ":" + sec;

        return time;
    }

    public static void main(String[] args) {
        String time = "02:01:05AM";
        System.out.println(solve(time));
    }
}
