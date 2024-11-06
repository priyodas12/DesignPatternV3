package tech.java.solid.principles.ISP;

// break down the large OrderService interface into smaller,
// more specific interfaces. This way, each class only implements the methods it actually uses.

public interface OrderService {

  void placeOrder();

  void cancelOrder();

  void scheduleDelivery();

  void processRefund();
}

