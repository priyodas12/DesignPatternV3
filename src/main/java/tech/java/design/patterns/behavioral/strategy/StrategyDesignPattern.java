package tech.java.design.patterns.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//The Strategy Pattern allows selecting an algorithm's behavior at runtime.
//Java's Collections.sort() method uses the Strategy Pattern. The method accepts a Comparator, which determines the sorting logic.
public class StrategyDesignPattern {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Alice", "Bob");

    // Using a custom Comparator (strategy)
    Collections.sort(names, Comparator.naturalOrder());
    System.out.println("Ascending: " + names);

    Collections.sort(names, Comparator.reverseOrder());
    System.out.println("Descending: " + names);
  }
}
