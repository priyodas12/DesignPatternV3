package tech.java.design.patterns.behavioral.CommandPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//The Command Pattern encapsulates a request as an object, allowing parameterization and queuing of requests.
public class CommandPatternExample {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    // Commands encapsulated in Runnable
    Runnable task1 = () -> System.out.println("Task 1 executed.");
    Runnable task2 = () -> System.out.println("Task 2 executed.");

    executor.submit(task1);
    executor.submit(task2);

    executor.shutdown();
  }
}
