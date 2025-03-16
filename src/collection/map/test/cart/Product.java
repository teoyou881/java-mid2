package collection.map.test.cart;

import java.util.Objects;

public class Product {

  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  /*
   * should override equals & hashCode
   * */

  @Override
  public final boolean equals(Object o) {
    if (!(o instanceof Product product)) {
      return false;
    }

    return price == product.price && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    int result = Objects.hashCode(name);
    result = 31 * result + price;
    return result;
  }
}