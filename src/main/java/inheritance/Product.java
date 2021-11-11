package inheritance;

import java.util.*;

public class Product implements Comparable<Product> {

    public String productID;
    public Integer quantity;
    public String product;
    public Boolean isPaid;

    public Product(String productID, int quantity, String product, boolean isPaid)
    {
        this.productID = productID;
        this.quantity = quantity;
        this.product = product;
        this.isPaid = isPaid;
    }

    @Override
    public int compareTo(Product o) {
        return String.CASE_INSENSITIVE_ORDER.compare(o.product, this.product);
    }

    @Override
    public String toString() {
        return "{\n"
                + "        productID: " + this.productID
                + ",\n        quantity: " + this.quantity
                + ",\n        product: " + this.product
                + ",\n        isPaid: " + this.isPaid
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
}
