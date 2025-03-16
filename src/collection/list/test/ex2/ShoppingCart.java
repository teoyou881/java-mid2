package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

  List<Item> items = new ArrayList<Item>();

  public void addItem(Item item) {
    items.add(item);
  }

  public void displayItems() {
    int totalPrice = 0;
    System.out.println("display");
    for (Item item : items) {
      System.out.println("name: " + item.getName() + " total price: " + item.getTotalPrice());
    }
    for (Item item : items) {
      totalPrice += item.getTotalPrice();
    }
    System.out.println("Total price: " + totalPrice);
  }
}
