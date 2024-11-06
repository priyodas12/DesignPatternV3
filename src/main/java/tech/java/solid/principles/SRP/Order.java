package tech.java.solid.principles.SRP;

import java.util.ArrayList;
import java.util.List;

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
