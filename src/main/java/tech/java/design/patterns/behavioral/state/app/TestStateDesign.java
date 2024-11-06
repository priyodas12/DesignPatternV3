package tech.java.design.patterns.behavioral.state.app;


import tech.java.design.patterns.behavioral.state.context.OrderContext;

public class TestStateDesign {

  public static void main(String[] args) {
    OrderContext order = new OrderContext();
    order.previousState();
    do {
      System.out.println(
          "Current State:: " + order.getStatus());
      // System.out.println(order.getStatus());
      order.nextState();
    }
    while (!order.isFinalState());
    System.out.println(order.getStatus());
  }
}