package ThreadsSample;

class Thread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("inside thread2 interface "+Thread.currentThread().getName());//to get the current thread name
        System.out.println("this is simple thread");
    }
}