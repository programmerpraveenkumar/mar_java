package ExecutorServiceSample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorSample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();//only one thread can be executed.
        executorService.submit(new RunnableThread());//will execute the runnable thread.
        executorService.submit(new RunnableThread());//will execute the runnable thread.
        executorService.shutdown();//shutdown the executorService.otherwise executorService will wait to add other threads.
    }
}




