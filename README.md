# Task Scheduler using ScheduledExecutorService

## 📌 Project Overview
This project is a small, efficient task scheduler built in Java. It demonstrates the use of **Java Concurrency** and **Lambda Expressions**. The application accepts `Runnable` lambdas and executes them after specific delays using a `ScheduledExecutorService`. It also handles the graceful shutdown of the executor service to prevent memory leaks and ensure all tasks are completed.

## 🚀 Features
- **Lambda Expressions:** Uses modern Java functional programming for clean and concise task definitions.
- **ScheduledExecutorService:** Efficiently manages multiple threads to execute tasks after a defined delay.
- **Multiple Tasks:** Can handle multiple tasks with varying delay times concurrently.
- **Graceful Shutdown:** Implements `shutdown()` and `awaitTermination()` to ensure all tasks finish before the application terminates.

## 🛠️ Technologies Used
- **Language:** Java (JDK 8 or above)
- **Concurrency API:** `java.util.concurrent`

## 📂 Project Structure
- `Scheduler.java`: Contains the core logic, initializing the executor and the `schedule()` method.
- `Main.java`: The entry point where different Runnable lambdas are created and passed to the scheduler with specific delays.

## ⚙️ How to Run
1. Clone this repository or download the files.
2. Open the project in your preferred Java IDE (Eclipse, IntelliJ IDEA, etc.).
3. Compile and run the `Main.java` file.
4. Check the console output to see tasks executing at different intervals and the executor shutting down gracefully.

## 📝 Output Example
```text
Program started. Scheduling tasks...
Task scheduled for a delay of 1000 ms
Task scheduled for a delay of 3000 ms
Task scheduled for a delay of 5000 ms
-> Task 1 Executed! (Lambda) Delay was 1000ms. 
-> Task 2 Executed! (Lambda) Delay was 3000ms.
-> Task 3 Executed! (Lambda) Delay was 5000ms.

Shutting down the executor gracefully...
Executor shut down successfully. Program ended.