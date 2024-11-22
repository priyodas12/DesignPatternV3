package tech.java.design.patterns.structural.flyWeight;

//The Flyweight Pattern minimizes memory usage by sharing objects with the same state.

//Integer.valueOf(int): Caches Integer objects for values between -128 and 127.
//String.intern(): Shares instances of strings in the string pool.
//Boolean.valueOf(boolean): Reuses the Boolean.TRUE and Boolean.FALSE instances.
public class FlyweightExample {

  public static void main(String[] args) {
    Integer a = Integer.valueOf(127);
    Integer b = Integer.valueOf(127);

    System.out.println(a == b); // true, cached

    Integer c = Integer.valueOf(128);
    Integer d = Integer.valueOf(128);
  }
}
