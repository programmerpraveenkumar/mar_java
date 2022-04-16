package ExecutorServiceSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorFixedThreadPool {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(16);//16 thread can execute.
        int processorCount = Runtime.getRuntime().availableProcessors();//get the current system processors
        System.out.println("available processor is "+processorCount);
        ExecutorService executorService = Executors.newFixedThreadPool(processorCount);
        try{
            List<CallableThread> th1 = new ArrayList<CallableThread>();
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            th1.add(new CallableThread());
            executorService.invokeAll(th1);//should accept only Callable thread.
        }catch (Exception e){
            e.printStackTrace();
        }
        executorService.shutdown();//shutdown the executorService.otherwise executorService will wait to add other threads.
    }
}




