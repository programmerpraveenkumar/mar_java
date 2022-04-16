package ThreadsSample;



public class SynchronisationSample {

    public static void main(String[] args) {
        ThreadLogic obj = new ThreadLogic();
        sampleThread sample =  new sampleThread(obj);//same object shared with two threads
        sampleThread1 sample1 =  new sampleThread1(obj);//same object shared with two threads
        new Thread(sample).start();
        new Thread(sample1).start();

    }
}



class sampleThread implements Runnable{
    ThreadLogic thlogic;
    public sampleThread(ThreadLogic thlogic){
        this.thlogic= thlogic;
    }
    @Override
    public void run() {
        this.thlogic.printMessage(15);
    }
}

class sampleThread1 implements Runnable{
    ThreadLogic thlogic;
    public sampleThread1(ThreadLogic thlogic){
        this.thlogic= thlogic;
    }

    @Override
    public void run() {
            this.thlogic.printMessage(5);
    }
}

class ThreadLogic{
    //synchronized->other threads cannot invoke until current thread completes or released.
    synchronized  public  void printMessage(int start){
        for(int s = 0;s<start;s++){
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }

            System.out.println(s);
        }
    }

}