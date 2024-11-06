package tech.java.design.patterns.behavioral.state.impl;

public enum OrderStatus {
  NEW,
  PAYMENT_INITIATED,
  PAYMENT_SUCCESS,
  PAYMENT_ERROR,
  SHIPPED,
  DELIVERED,
  COMPLETED,
}
