package tech.java.solid.principles.OCP;


/*Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.*/

public class OpenClosePrinciple {

  //The Open/Closed Principle (OCP) suggests that a class should be extendable
  // to add new functionality without modifying its existing structure.
  public static void main(String[] args) {
    PaymentProcessor processor = new PaymentProcessor();
    processor.processPayment(new BitcoinPayment(), PaymentType.BITCOIN);
  }
}


