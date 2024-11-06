package tech.java.solid.principles.OCP;

public class PaymentProcessor {

  public void processPayment(Payment payment, PaymentType paymentType) {
    payment.pay(paymentType);
  }
}

