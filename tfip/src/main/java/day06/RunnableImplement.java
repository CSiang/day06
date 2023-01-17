package day06;

public class RunnableImplement implements Runnable {
    
    private String taskName;
    
    public RunnableImplement() {}; // Constructor
    
    public RunnableImplement(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++) {

            System.out.println(Thread.currentThread().getName() + "\t"+taskName + "\tRunnable..."+i);

        } // end of for loop

    } // end of run


}
