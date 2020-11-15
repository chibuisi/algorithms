package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public synchronized void process(){
        for(int i = 0; i < 1000; i++){
            stageOne();
            stageTwo();
        }
    }
    public void stageOne(){
        synchronized (lock1){
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }

    }
    public void stageTwo(){
        synchronized (lock2){
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }


    }
    public void main() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });
        t.start();
        t.start();
        t.join();
        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - start));
    }
}
