public class Main {
    public static void main(String[] args) {
        
        // Scheduler class ka object banaya
        Scheduler scheduler = new Scheduler();
        
        System.out.println("Program started. Scheduling tasks...\n");

        // Step 3: Runnable Lambdas banaye alag-alag delays ke sath
        
        // Task 1: 1 second delay
        Runnable task1 = () -> System.out.println("-> Task 1 Executed! (Lambda) Delay was 1000ms. Time: " + System.currentTimeMillis());
        
        // Task 2: 3 seconds delay
        Runnable task2 = () -> System.out.println("-> Task 2 Executed! (Lambda) Delay was 3000ms. Time: " + System.currentTimeMillis());
        
        // Task 3: 5 seconds delay
        Runnable task3 = () -> System.out.println("-> Task 3 Executed! (Lambda) Delay was 5000ms. Time: " + System.currentTimeMillis());

        scheduler.schedule(task1, 1000);
        scheduler.schedule(task2, 3000);
        scheduler.schedule(task3, 5000);

         try {
            Thread.sleep(6000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
     
        scheduler.shutdown(); 
    }
}