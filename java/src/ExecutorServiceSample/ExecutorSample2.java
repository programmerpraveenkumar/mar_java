package ExecutorServiceSample;

import sun.jvm.hotspot.tools.jcore.ClassDump;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
only runnable,callable interfaces can be used ExecutorService.
 */
public class ExecutorSample2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();//only one thread can be executed.
        try{
            Future<String> future = executorService.submit(new CallableThread());
            //Future<integer> future = executorService.submit(new newclassname());
            System.out.println(future.get());//hold the program till it gets the result.
            System.out.println("after future get");
        }catch (Exception e){
            e.printStackTrace();
        }
        executorService.shutdown();//shutdown the executorService.otherwise executorService will wait to add other threads.
    }
}




