package ExecutorServiceSample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorSampleFutureGet {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();//only one thread can be executed.
        try{
            Future<String> future = executorService.submit(new CallableThread());
            //Future<integer> future = executorService.submit(new newclassname());
            String message = future.get(1000, TimeUnit.MILLISECONDS);//get method can wait upto 1000MS or 1sec
            System.out.println("thread result is "+message);//hold the program till it gets the result.
            System.out.println("after future get");
        }catch (Exception e){
            e.printStackTrace();
        }
        executorService.shutdown();//shutdown the executorService.otherwise executorService will wait to add other threads.
    }
}




