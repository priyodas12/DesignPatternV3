package tech.java.solid.principles.OCP;

public class CreditCardPayment implements Payment {

  @Override
  public void pay(PaymentType paymentType) {
    System.out.println("PAID BY: " + paymentType.name());
  }
}
