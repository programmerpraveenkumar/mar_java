package ExecutorServiceSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorSample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();//only one thread can be executed.
        try{
            List<CallableThread> th1 = new ArrayList<CallableThread>();
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




