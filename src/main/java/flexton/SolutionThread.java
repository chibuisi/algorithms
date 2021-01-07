package flexton;

import java.util.concurrent.*;

public class SolutionThread {
    public static void main(String[] args) throws InterruptedException {
        Callable c = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        };

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Results is 1");
            }
        };

        Thread t1 = new Thread(r);
        t1.start();


        ExecutorService executor = Executors.newFixedThreadPool(5);
        int sum = 0;
        for(int i = 0; i < 10; i++){
            Future<Integer> res = executor.submit(c);
            try {
                sum += res.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);
        if(executor.isShutdown())
            System.out.println("sum is "+sum);
    }
}
