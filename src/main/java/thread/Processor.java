package thread;

import java.util.Random;
import java.util.concurrent.*;

public class Processor implements Callable<Integer> {
    private int id;
    private Random random = new Random();

    public Processor(int id){
        this.id = id;
    }

    public Integer call(){
        System.out.println("Starting..."+id);
        int value = random.nextInt(id*1000);
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed..."+id);
        return value;
    }
}
class App2{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        int val = 0;
        for(int i = 1; i <= 5; i++){
            Future<Integer> future = executors.submit(new Processor(i));
            val += future.get();
        }

        executors.shutdown(); System.out.println(val);
        executors.awaitTermination(1, TimeUnit.DAYS);
    }
}