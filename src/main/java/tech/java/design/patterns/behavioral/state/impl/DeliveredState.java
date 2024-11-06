package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class DeliveredState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Delivery agent delivered product,no further action as of now!");
    context.setState(new CompleteState());
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    context.setState(new ShipmentState());
  }

  @Override
  public String getStatus() {
    return OrderStatus.DELIVERED.toString();
  }

  @Override
  public boolean isFinalState() {
    return false;
  }
}