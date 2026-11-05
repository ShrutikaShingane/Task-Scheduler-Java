import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scheduler {
     private final ScheduledExecutorService executorService;

   
    public Scheduler() {
        this.executorService = Executors.newScheduledThreadPool(2); 
    }

     public void schedule(Runnable task, long delayMs) {
        System.out.println("Task scheduled for a delay of " + delayMs + " ms");
        executorService.schedule(task, delayMs, TimeUnit.MILLISECONDS);
    }

   
    public void shutdown() {
        System.out.println("\nShutting down the executor gracefully...");
        executorService.shutdown(); 
        try {
              if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow(); 
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
        System.out.println("Executor shut down successfully. Program ended.");
    }
}