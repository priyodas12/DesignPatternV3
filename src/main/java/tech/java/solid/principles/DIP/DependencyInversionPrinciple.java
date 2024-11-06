package tech.java.solid.principles.DIP;

/*High-level modules should not depend on low-level modules. Both should depend on abstractions.*/

public class DependencyInversionPrinciple {

  public static void main(String[] args) {

    PaymentService paymentService = new GpayPaymentService();
    OrderService orderService = new OrderService(paymentService);

    orderService.placeOrder(10);
  }
}

