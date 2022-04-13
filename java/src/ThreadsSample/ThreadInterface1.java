package ThreadsSample;



public class ThreadInterface1{
    public static void main(String[] args) {
        System.out.println("in the main function "+Thread.currentThread().getName());//to get the current thread name

        Thread th = new Thread(new Thread2());//pass the runnable object.
        th.start();//run the interface thread.

        //new Thread(new Thread2()).start();//creating thread .
    }
}


