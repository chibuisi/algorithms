package dailychallenge;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;

public class RateLimit {
    private static Queue<Integer> callCounter;
    private static int counter = 0;
    private static int lastTime = 0;
    public RateLimit(){
        callCounter = new LinkedList<>();
    }

    public static void shouldCall(int time){
        BigInteger bg = BigInteger.valueOf(time);
        BigInteger b = BigInteger.ONE;
        BigInteger diff = bg.subtract(b);
        //if(callCounter.size() < 5)
            callCounter.add(time);
        while(!callCounter.isEmpty() && callCounter.peek() < time - 5000){
            callCounter.remove();
        }
        if(callCounter.size() > 5)
            System.out.println("No");
        else if(callCounter.size() <= 5)
            System.out.println("Yes");
    }

    public static void shouldCall2(int time){
        counter++;
        if(counter == 5 && time - lastTime > 5000){
            counter = 0;
        }
        lastTime = time;
        if(counter < 5)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        RateLimit rateLimit = new RateLimit();
//        shouldCall(1);
//        shouldCall(2);
//        shouldCall(400);
//        shouldCall(501);
//        shouldCall(606);
//        shouldCall(707);
//        shouldCall(1008);
//        shouldCall(4008);
//        shouldCall(6009);
//        shouldCall(6010);
//        shouldCall(6011);
//        shouldCall(6012);
//        shouldCall(6013);
        shouldCall2(1);
        shouldCall2(2);
        shouldCall2(3);
        shouldCall2(4);
        shouldCall2(5010);
    }
}
