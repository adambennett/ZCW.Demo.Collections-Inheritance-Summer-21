package collections;

import inheritance.*;

import java.util.*;
import java.util.concurrent.*;

public class Warehouse implements Iterable<Product>
{
    private final List<Product> products;

    public Warehouse()
    {
        this.products = new ArrayList<>();
        var apple = new Product("0", 1, "Apple", false);
        var soda = new Product("1", 1, "Dr. Pepper (12 pack)", false);
        var beef = new Product("2", 1, "Pound of ground beef", false);
        var napkins = new Product("3", 1, "Napkins", false);
        for (var i = 0; i < 100; i++) {
            var roll = ThreadLocalRandom.current().nextInt(0, 4);
            switch (roll) {
                case 0 -> this.products.add(apple);
                case 1 -> this.products.add(soda);
                case 2 -> this.products.add(beef);
                case 3 -> this.products.add(napkins);
                default -> {}
            }
        }
    }

    public void store(Product product)
    {
        this.products.add(product);
    }

    public boolean remove(Product product)
    {
        return this.products.remove(product);
    }

    public List<Product> getProducts()
    {
        return this.products;
    }

    public void sort()
    {
        Collections.sort(this.products);
    }

    @SuppressWarnings("Java8ListSort")
    public void sort(SortingFunction<Product> func)
    {
        GenericProductCompare compare = new GenericProductCompare(func);
        Collections.sort(this.products, compare);
    }

    @Override
    public Iterator<Product> iterator()
    {
        return this.products.iterator();
    }

    @Override
    public String toString() {
        return this.products.toString();
    }

}
