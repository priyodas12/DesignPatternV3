package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class PaidState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Payment Transaction Completed");
    context.setState(new ShipmentState());
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    context.setState(new PaymentState());
  }

  @Override
  public String getStatus() {
    return OrderStatus.PAYMENT_SUCCESS.toString();
  }

  @Override
  public boolean isFinalState() {
    return false;
  }
}