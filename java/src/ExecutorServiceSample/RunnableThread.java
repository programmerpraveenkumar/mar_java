package ExecutorServiceSample;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(500);
        }catch (Exception e){

        }

        System.out.println("simple runnable "+Thread.currentThread().getName());
    }
}
