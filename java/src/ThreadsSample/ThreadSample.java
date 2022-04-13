package ThreadsSample;


/*
Main thread will be created on the main method.
in java all threads run on main thread.

Thread Creation in java.
1.Using parent class Thread.(using inheritance)
2.using interface Runnable .(using implements)
 */
public class ThreadSample {
    public static void main(String[] args) {
        System.out.println("in the main function "+Thread.currentThread().getName());//to get the current thread name
//        int[] ar = {};
//        System.out.println(ar[5]);//error.program stopped.
        Thread1 th1 = new Thread1();//creating the thread object.
        th1.start();//start the thread.
       // th1.run();//on the main thread.New thread will not be created.
    }
}

class Thread1 extends Thread{

    //override the run method from the thread class
    @Override
    public void run() {
        System.out.println("inside thread1 class "+Thread.currentThread().getName());//to get the current thread name
        System.out.println("this is simple thread");
    }
}