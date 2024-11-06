package tech.java.solid.principles.DIP;

public class GpayPaymentService implements PaymentService {

  @Override
  public boolean doPayment() {
    System.out.println("Payment done via G-pay");
    return true;
  }
}
