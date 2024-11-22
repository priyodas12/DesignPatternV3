package tech.java.design.patterns.creational.singleton;

public class SingletonTest {

  public static void main(String[] args) {
    SingletonImpl singletonInstance1 = SingletonImpl.getInstance();
    SingletonImpl singletonInstance2 = SingletonImpl.getInstance();
    System.out.println(singletonInstance1.equals(singletonInstance2));
  }
}
