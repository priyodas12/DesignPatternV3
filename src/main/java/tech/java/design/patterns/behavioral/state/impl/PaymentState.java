package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class PaymentState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Payment gateway called : payment process starts");
    context.setState(new PaidState());
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    context.setState(new NewOrderState());
  }

  @Override
  public String getStatus() {
    return OrderStatus.PAYMENT_INITIATED.toString();
  }

  @Override
  public boolean isFinalState() {
    return false;
  }
}
