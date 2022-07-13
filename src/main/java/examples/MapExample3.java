package examples;

import collections.*;
import inheritance.*;

import java.util.*;

public class MapExample3
{
    public static void run()
    {
        var map = new HashMap<String, Sellable>();
        var vehicleQuantities = new HashMap<String, Integer>();
        var warehouse = new Warehouse();

        // Organize warehouse
        for (var product : warehouse)
        {
            if (map.containsKey(product.getStoreDisplayName()))
            {
                var mapped = map.get(product.getStoreDisplayName());
                if (mapped instanceof Product p) {
                    p.quantity++;
                } else if (mapped instanceof Vehicle v) {
                    if (vehicleQuantities.containsKey(v.getStoreDisplayName())) {
                        var newAmount = vehicleQuantities.get(v.getStoreDisplayName()) + 1;
                        vehicleQuantities.put(v.getStoreDisplayName(), newAmount);
                    } else {
                        vehicleQuantities.put(v.getStoreDisplayName(), 1);
                    }
                }
            }

            else
            {
                map.put(product.getStoreDisplayName(), product);
                if (product instanceof Vehicle) {
                    vehicleQuantities.put(product.getStoreDisplayName(), 1);
                }
            }
        }

        // Print contents of warehouse
        for (var entry : map.entrySet())
        {
            var value = entry.getValue();
            String middle;
            if (value instanceof Product p) {
                middle = entry.getKey() + ": " + p;
            } else if (value instanceof Vehicle v) {
                var quantity = vehicleQuantities.get(v.getStoreDisplayName());
                var productId = warehouse.getProductId(v.getStoreDisplayName());
                middle = entry.getKey() + ": " + v.display(quantity, productId);
            } else {
                middle = entry.getKey() + ": " + entry.getValue();
            }
            System.out.println("{\n    " + middle + "\n},");
        }
    }

}
