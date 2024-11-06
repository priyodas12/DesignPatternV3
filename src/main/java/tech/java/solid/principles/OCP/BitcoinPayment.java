package tech.java.solid.principles.OCP;

public class BitcoinPayment implements Payment {

  @Override
  public void pay(PaymentType paymentType) {
    System.out.println("PAID BY: " + paymentType.name());
  }
}
