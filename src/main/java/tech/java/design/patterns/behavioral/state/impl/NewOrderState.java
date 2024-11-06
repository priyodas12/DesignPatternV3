package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class NewOrderState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Order invoice created : payment required now");
    context.setState(new PaymentState());
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    System.out.println("The order is already in the New state, no previous state.");
  }

  @Override
  public String getStatus() {
    return OrderStatus.NEW.toString();
  }

  @Override
  public boolean isFinalState() {
    return false;
  }
}