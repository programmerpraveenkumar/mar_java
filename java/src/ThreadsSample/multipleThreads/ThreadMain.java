package ThreadsSample.multipleThreads;

public class ThreadMain {
    public static void main(String[] args) {
        ThreadInter thintr = new ThreadInter();
        ThreadInter thintr2 = new ThreadInter();

        new Thread(thintr).start();
        new Thread(thintr2).start();

    }
}
