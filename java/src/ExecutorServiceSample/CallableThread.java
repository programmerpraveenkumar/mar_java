package ExecutorServiceSample;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("insdie callable thread");
        Thread.sleep(1000);
        return "from callable thread.";
    }
}
