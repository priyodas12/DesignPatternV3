package tech.java.solid.principles;


/*Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.*/

public class OpenClosePrinciple {
  //The Open/Closed Principle (OCP) suggests that a class should be extendable
  // to add new functionality without modifying its existing structure.
}


class PaymentProcessor {

  public void processPayment(String paymentType) {
    switch (paymentType) {
      case "creditcard":
        // Process credit card payment
        break;
      case "paypal":
        // Process PayPal payment
        break;
      case "applepay":
        // Process Apple Pay payment
        break;
    }
  }
}
