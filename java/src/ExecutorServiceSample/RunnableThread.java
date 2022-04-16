package ExecutorServiceSample;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(500);
            System.out.println("simple thread programming..");
        }catch (Exception e){

        }

        System.out.println("simple runnable "+Thread.currentThread().getName());
    }
}
