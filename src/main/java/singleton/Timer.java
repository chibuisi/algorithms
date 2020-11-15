package singleton;

public class Timer {
    private static Timer timerInstance;
    private Timer(){}
    public static Timer getInstance(){
        if(timerInstance == null){
            synchronized (Timer.class){
                if(timerInstance == null){
                    timerInstance = new Timer();
                }
            }
        }
        return timerInstance;
    }
}
