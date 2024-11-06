package tech.java.design.patterns.behavioral.state.impl;

import tech.java.design.patterns.behavioral.state.context.OrderContext;
import tech.java.design.patterns.behavioral.state.contract.OrderState;

public class ShipmentState implements OrderState {

  @Override
  public String next(OrderContext context) {
    System.out.println("Assigning Delivery agent for shipment!");
    context.setState(new DeliveredState());
    return context.getStatus();
  }

  @Override
  public void previous(OrderContext context) {
    context.setState(new PaidState());
  }

  @Override
  public String getStatus() {
    return OrderStatus.SHIPPED.toString();
  }

  @Override
  public boolean isFinalState() {
    return false;
  }
}