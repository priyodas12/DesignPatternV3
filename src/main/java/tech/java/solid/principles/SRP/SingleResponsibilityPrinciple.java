package tech.java.solid.principles;

/*A class should have only one reason to change.*/

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 1.Changes in one area of the software will not require changes to other unrelated areas, reducing bugs and the risk of breaking unrelated features.
 * 2.Code is more modular and easier to maintain, as each class handles a specific piece of functionality.
 * 3.Testing becomes simpler because each class has a single behavior to test.
 * </pre>
 */
public class SingleResponsibilityPrinciple {
  //metadata:class
}

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

class Order {

  private List<Item> items = new ArrayList<>();

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }

  public List<Item> getItems() {
    return items;
  }
}

class Item {

  private double price;

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

