package inheritance;

import java.util.*;

public class Product implements Sellable, Comparable<Product> {

    public String productID;
    public Integer quantity;
    public String item;
    public Double price;

    public Product(String productID, int quantity, String item, double price)
    {
        this.productID = productID;
        this.quantity = quantity;
        this.item = item;
        this.price = price;
    }

    public Product(String productID, int quantity, Sellable item, double price) {
        this.productID = productID;
        this.quantity = quantity;
        this.item = item.getStoreDisplayName();
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return String.CASE_INSENSITIVE_ORDER.compare(o.item, this.item);
    }

    @Override
    public String toString() {
        return "{\n"
                + "        productID: " + this.productID
                + ",\n        quantity: " + this.quantity
                + ",\n        item: " + this.item
                + ",\n        price: $" + this.price
                + "\n    }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(productID, product.productID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID);
    }

    @Override
    public int getSalesPrice() {
        return this.price != null ? this.price.intValue() : 0;
    }

    @Override
    public String getStoreDisplayName() {
        return this.item;
    }
}
