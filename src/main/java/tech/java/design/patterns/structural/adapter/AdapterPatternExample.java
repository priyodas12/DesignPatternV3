package tech.java.design.patterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

//Java's java.util.Arrays.asList() is an adapter. It adapts an array to the List interface.
//InputStreamReader and OutputStreamWriter: Adapts byte streams to character streams.
public class AdapterPatternExample {

  public static void main(String[] args) {
    String[] array = {"One", "Two", "Three"};

    // Adapting array to List
    List<String> list = Arrays.asList(array);

    System.out.println("List: " + list);
  }
}
