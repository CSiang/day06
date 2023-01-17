package day06;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        // Thread thread1 = new Thread( new Runnable() {
        //     @Override
        //     public void run() {
        //         // Here to specify the code you want to run.
        //         for (int i=0; i<10; i++){
        //             System.out.println(Thread.currentThread().getName() + "\tRunnable ..." +i);
        //             // Thread.currentThread().getName() is to get the name of the thread that is running.
        //             }// end of for
        //          } // end of run
        //     } ); // end of runnable

        // thread1.start();

        RunnableImplement mRI = new RunnableImplement ("task1");
        RunnableImplement mRI2 = new RunnableImplement ("task2");
        RunnableImplement mRI3 = new RunnableImplement ("task3");
        RunnableImplement mRI4 = new RunnableImplement ("task4");
        RunnableImplement mRI5 = new RunnableImplement ("task5");

        // Thread thread2 = new Thread(mRI);
        // thread2.start();

        // Thread thread3 = new Thread(mRI);
        // thread3.start();

        // ExecutorService executorService = Executors.newSingleThreadExecutor(); // This is only using single thread.
        // executorService.execute(mRI);
        // executorService.execute(mRI2);
        // executorService.shutdown();

        // ExecutorService executorService2 = Executors.newFixedThreadPool(3); // Max threads will be as stated, which is 3 in this case
        // executorService2.execute(mRI);
        // executorService2.execute(mRI2);
        // executorService2.execute(mRI3);
        // executorService2.execute(mRI4);
        // executorService2.execute(mRI5);
        // executorService2.shutdown();    

        ExecutorService executorService3 = Executors.newCachedThreadPool(); // Max threads will be the max number of thread your pc can handle
        executorService3.execute(mRI);
        executorService3.execute(mRI2);
        executorService3.execute(mRI3);
        executorService3.execute(mRI4);
        executorService3.execute(mRI5);
        executorService3.shutdown();  

        // Below are showing lambda function.
        RunnableInterface<Integer> addOperation = (a,b) -> { 
            return a+b;
        };

        RunnableInterface<Integer> multiplyOperation = (a,b) -> {
            return a*b;
        };

        RunnableInterface<Integer> MinusOperation = (a,b) -> { 
            return a-b;
        };
        RunnableInterface<String> concatenateString = (a,b) -> {
            return a+b;
        };
        
        System.out.println("addOperation " + addOperation.process(1,1));
        System.out.println("multiplyOperation " + multiplyOperation.process(2,5));
        System.out.println("MinusOperation " + MinusOperation.process(50,5));
        System.out.println("concatenateString " + concatenateString.process("Aba", "Ipsen"));



    }
}
