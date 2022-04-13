package ThreadsSample.multipleThreads;

public class ThreadInter implements Runnable,ExamplInterface{
    @Override
    public void run() {
        try{
                Thread.sleep(1000);//sleep or pause the thread for 500 ms
                 System.out.println("thread   "+Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println("thread  Exception "+Thread.currentThread().getName()+"--"+e.getMessage());
            }


//        for(int i = 0;i<10;i++){
//            try{
//                Thread.sleep(500);//sleep or pause the thread for 500 ms
//            }catch (InterruptedException e) {
//                System.out.println("interrupt Exception");
//            }catch (Exception e){
//            }
//            System.out.println("thread "+i+" "+Thread.currentThread().getName());
//        }
    }
}
