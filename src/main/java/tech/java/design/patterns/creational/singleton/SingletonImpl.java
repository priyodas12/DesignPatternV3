package tech.java.design.patterns.creational.singleton;

//java.lang.Runtime: The Runtime class uses the Singleton pattern to ensure only one instance of the runtime environment exists.
public class SingletonImpl {

  private static SingletonImpl instance;

  private SingletonImpl() {
    System.out.println("Singleton is Instantiated.");
  }

  public static SingletonImpl getInstance() {
    if (instance == null) {
      instance = new SingletonImpl();
    }
    return instance;
  }

}
