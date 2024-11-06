package tech.java.design.patterns.behavioral.state.contract;

import tech.java.design.patterns.behavioral.state.context.OrderContext;

public interface OrderState {

  String next(OrderContext context);

  void previous(OrderContext context);

  String getStatus();

  boolean isFinalState();
}