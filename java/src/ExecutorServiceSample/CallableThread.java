package ExecutorServiceSample;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {
    String name = "";
    public CallableThread(){

    }
    public CallableThread(String name){
            this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("insdie callable thread "+this.name);
        Thread.sleep(500);
        return "from callable thread. "+this.name;
    }
}
