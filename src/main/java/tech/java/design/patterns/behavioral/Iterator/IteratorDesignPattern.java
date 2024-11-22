package tech.java.design.patterns.behavioral.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//The Iterator Pattern provides a way to access elements of a collection sequentially without exposing its internal structure.
public class IteratorDesignPattern {

  public static void main(String[] args) {
    List<String> nameList = Arrays.asList("John", "Alice", "Bob");

    Set<String> nameSet = Set.of("John", "Alice", "Bob");

    Iterator<String> iterator1 = nameList.iterator();
    while (iterator1.hasNext()) {
      System.out.println(iterator1.next());
    }

    Iterator<String> iterator2 = nameSet.iterator();
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
  }
}
