package ThreadsSample.multipleThreads;

public class ThreadJoin {
    public static void main(String[] args) {
        ThreadInter thintr = new ThreadInter();
        ThreadInter thintr2 = new ThreadInter();

        Thread th = new Thread(thintr);
        th.start();
        th.interrupt();//ony sleeping thread can be interrupt
        try{
            th.join();//stop further thread to start until this thread to complete.
        }catch (Exception e){
            e.printStackTrace();
        }
        new Thread(thintr2).start();

    }
}
