package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class CompleteState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Completed Order Processing");
    context.setState(this);
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    context.setState(new DeliveredState());
  }

  @Override
  public String getStatus() {
    return OrderStatus.COMPLETED.toString();
  }

  @Override
  public boolean isFinalState() {
    return true;
  }
}
