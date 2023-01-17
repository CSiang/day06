package day06;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread( new Runnable() {
            @Override
            public void run() {
                // Here to specify the code you want to run.
                for (int i=0; i<20; i++){
                    System.out.println(Thread.currentThread().getName() + "\tRunnable ..." +i);
                    // Thread.currentThread().getName() is to get the name of the thread that is running.
                    }// end of for
                 } // end of run
            } ); // end of runnable

        thread1.start();

        RunnableImplement mRI = new RunnableImplement ();
        Thread thread2 = new Thread(mRI);
        thread2.start();

        Thread thread3 = new Thread(mRI);
        thread3.start();



    }
}
