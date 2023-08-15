public class RunnableExample implements Runnable {
    public void run() {
        for (int i=1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Count " + i);
        }
    }
    
    public static void main(String[] args) {
        RunnableExample runnable = new RunnableExample();

        Thread thread1 = new Thread(runnable, "Thread A");
        Thread thread2 = new Thread(runnable, "Thread B");

        thread1.start();
        thread2.start();
    }
}