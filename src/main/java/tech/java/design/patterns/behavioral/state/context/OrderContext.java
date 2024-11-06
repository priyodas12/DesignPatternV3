package tech.java.design.patterns.behavioral.state.context;

import tech.java.design.patterns.behavioral.state.contract.OrderState;
import tech.java.design.patterns.behavioral.state.impl.NewOrderState;

public class OrderContext {

  private OrderState currentState;

  public OrderContext() {
    //starting point
    currentState = new NewOrderState();
  }

  public void setState(OrderState state) {
    this.currentState = state;
  }

  public String nextState() {
    currentState.next(this);
    return currentState.toString();
  }

  public void previousState() {
    currentState.previous(this);
  }

  public String getStatus() {
    return currentState.getStatus();
  }

  public boolean isFinalState() {
    return currentState.isFinalState();
  }
}
