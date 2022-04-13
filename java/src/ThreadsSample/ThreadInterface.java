package ThreadsSample;

public class ThreadInterface{
    public static void main(String[] args) {
        System.out.println("in the main function "+Thread.currentThread().getName());//to get the current thread name
        Thread2 th2 = new Thread2();
        //java.lang
        Thread th = new Thread(th2);//pass the thread2 object.
        th.start();//run the interface thread.
    }
}


