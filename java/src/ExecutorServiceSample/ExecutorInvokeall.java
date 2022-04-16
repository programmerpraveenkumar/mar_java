package ExecutorServiceSample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorInvokeall {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newFixedThreadPool(16);//16 thread can execute.
        //int processorCount = Runtime.getRuntime().availableProcessors();//get the current system processors
        //System.out.println("available processor is "+processorCount);
        ExecutorService executorService = Executors.newCachedThreadPool();
        try{
            List<CallableThread> th1 = new ArrayList<CallableThread>();
            th1.add(new CallableThread("first-0"));
            th1.add(new CallableThread("first-1"));
            th1.add(new CallableThread("first-2"));
            th1.add(new CallableThread("first-3"));
            th1.add(new CallableThread("first-4"));
            List<Future<String>> result =  executorService.invokeAll(th1);
            for(Future res:result){
                System.out.println("thread value is "+res.get());//get the value from the executorsevice.
            }
            System.out.println(result);//any  one result(random)
        }catch (Exception e){
            e.printStackTrace();
        }
        executorService.shutdown();//shutdown the executorService.otherwise executorService will wait to add other threads.
    }
}




