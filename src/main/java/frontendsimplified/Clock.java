package frontendsimplified;

public class Clock {
    public static double solve(int hour, int minutes){
        double hourHand = ((hour % 12) * 0.5) + ((minutes / 60) * 6);
        //if there is a constraint for 1 <= hour <= 1 and 1 <= minutes <= 59
        //then hourHand = hour * 30
        double minuteHand = minutes * 6;
        double diff = Math.abs(hourHand - minuteHand);
        return Math.min(360 - diff, diff);
    }

    public static double solve2(int hour, int minutes) {

        // Degree covered by hour hand (hour area + minutes area)
        double h = (hour%12 * 30) + ((double)minutes/60 * 30);

        // Degree covered by minute hand (Each minute = 6 degree)
        double m = minutes * 6;

        // Absolute angle between them
        double angle = Math.abs(m - h);

        // If the angle is obtuse (>180), convert it to acute (0<=x<=180)
        if (angle > 180) angle = 360.0 - angle;

        return angle;
    }

    public static void main(String[] args) {
        System.out.println( solve(9, 30));
    }
}
