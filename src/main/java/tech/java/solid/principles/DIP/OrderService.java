package tech.java.solid.principles.DIP;

public class OrderService {

  //high level module must use abstraction of low level module
  private final PaymentService paymentService;

  public OrderService(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public void placeOrder(int orderId) {
    System.out.println("Order initiated...payment required!");
    paymentService.doPayment();
    System.out.println("Order initiated...payment done!");
  }
}
