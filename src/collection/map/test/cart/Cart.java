package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartMap = new HashMap<>();

  public void add(Product product, int quantity) {
    if (cartMap.containsKey(product)) {
      cartMap.put(product, cartMap.get(product) + quantity);
    } else {
      cartMap.put(product, quantity);
    }
  }

  public void minus(Product product, int quantity) {
    if (cartMap.containsKey(product)) {
      cartMap.remove(product, quantity);
    }
  }

  public void printAll() {
    cartMap.forEach((k, v) -> System.out.print(k.getName() + ": " + v + "  "));
    System.out.println();
  }

}