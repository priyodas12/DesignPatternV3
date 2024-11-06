package tech.java.solid.principles.SRP;

// single responsibility
class OrderCalculator {

  public double calculateTotal(Order order) {
    double total = 0;
    for (Item item : order.getItems()) {
      total += item.getPrice();
    }
    return total;
  }
}
