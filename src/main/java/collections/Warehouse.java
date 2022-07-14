package collections;

import inheritance.*;

import java.util.*;
import java.util.concurrent.*;

public class Warehouse implements Iterable<Sellable>
{
    private final List<Sellable> products;
    private final Map<String, String> productIds;

    public Warehouse()
    {
        this.products = new ArrayList<>();
        this.productIds = new HashMap<>();
        var apple = new Product("APP:10:1657741280891", 1, "Apple", 1.25);
        var soda = new Product("DRP:10:1657741280892", 1, "Dr. Pepper (12 pack)", 9.99);
        var beef = new Product("GBF:10:1657741280893", 1, "Pound of ground beef", 7.50);
        var napkins = new Product("NAP:10:1657741280894", 1, "Napkins", 4.99);

        var mountainBike = new MountainBike(6, 25, 3);
        mountainBike.name = "Mountain bike";

        var car = new Car(4, 5);
        car.name = "Car (4-door)";

        var truck = new Truck(4, 8);
        truck.name = "SUV";

        var bike = new Bicycle(6, 18);
        var bike2 = new Bicycle(6, 25);
        bike.name = "Kids Bicycle";
        bike2.name = "Racing Bike";
        bike2.setSalePrice(300);
        var bikeProduct = new Product("BIK:10:1657741280895", 1, bike2, bike2.getSalesPrice());

        for (var i = 0; i < 100; i++) {
            var roll = ThreadLocalRandom.current().nextInt(0, 9);
            switch (roll) {
                //case 0 -> this.store(apple);
                case 1 -> this.store(soda);
                case 2 -> this.store(beef);
                case 3 -> this.store(napkins);
                case 4 -> this.store(bike);
                case 5 -> this.store(mountainBike);
                case 6 -> this.store(car);
                case 7 -> this.store(truck);
                case 8 -> this.store(bikeProduct);
                default -> {}
            }
        }
    }

    public void store(Sellable product)
    {
        if (product instanceof Product p) {
            this.productIds.put(p.getStoreDisplayName(), p.productID);
        } else {
            var newProductId = product.getStoreDisplayName().substring(0, 3).toUpperCase() + ":" + new Date().getDate() + ":" + new Date().getTime();
            this.productIds.put(product.getStoreDisplayName(), newProductId);
        }
        this.products.add(product);
    }

    public String getProductId(String itemDisplayName) {
        return this.productIds.getOrDefault(itemDisplayName, "Unknown item!");
    }

    public boolean remove(Sellable product)
    {
        return this.products.remove(product);
    }

    public List<Sellable> getProducts()
    {
        return this.products;
    }

    @Override
    public Iterator<Sellable> iterator()
    {
        return this.products.iterator();
    }

    @Override
    public String toString() {
        return this.products.toString();
    }

}
